// ==========================================================
// 1882. Process Tasks Using Servers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 227 ms (Beats 69%)
// Memory     : 169.1 MB (Beats 77%)
// Link       : https://leetcode.com/problems/process-tasks-using-servers/
// ==========================================================


import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        int n = servers.length;
        int m = tasks.length;

        int[] ans = new int[m];

        PriorityQueue<int[]> free = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        // [freeTime, weight, index]
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Long.compare(a[0], b[0]);
            }
            if (a[1] != b[1]) {
                return Long.compare(a[1], b[1]);
            }
            return Long.compare(a[2], b[2]);
        });

        // Initially all servers are free
        for (int i = 0; i < n; i++) {
            free.offer(new int[]{servers[i], i});
        }

        long time = 0;

        for (int i = 0; i < m; i++) {

            // Time must never go backwards
            time = Math.max(time, i);

            // Release all available servers
            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                long[] s = busy.poll();
                free.offer(new int[]{(int)s[1], (int)s[2]});
            }

            // If no server is free, wait
            if (free.isEmpty()) {

                time = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] <= time) {
                    long[] s = busy.poll();
                    free.offer(new int[]{(int)s[1], (int)s[2]});
                }
            }

            // Select the best free server
            int[] s = free.poll();

            int weight = s[0];
            int index = s[1];

            ans[i] = index;

            // Assign task and update server's free time
            busy.offer(new long[]{
                time + tasks[i],
                weight,
                index
            });
        }

        return ans;
    }
}
