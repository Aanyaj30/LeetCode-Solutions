// ==========================================================
// 1606. Find Servers That Handled Most Number of Requests
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 125 ms (Beats 68%)
// Memory     : 100.8 MB (Beats 71%)
// Link       : https://leetcode.com/problems/find-servers-that-handled-most-number-of-requests/
// ==========================================================


import java.util.*;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        TreeSet<Integer> available = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        // Stores {endTime, serverId}
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int[] count = new int[k];

        for (int i = 0; i < arrival.length; i++) {

            // Free all servers whose requests are completed
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                int[] curr = busy.poll();
                available.add(curr[1]);
            }

            if (available.isEmpty()) {
                continue;
            }

            // Find server starting from i % k
            int server = i % k;

            Integer chosen = available.ceiling(server);

            // If no server >= server, wrap around
            if (chosen == null) {
                chosen = available.first();
            }

            // Assign request
            available.remove(chosen);

            count[chosen]++;

            // Store completion time and server ID
            busy.offer(new int[]{arrival[i] + load[i], chosen});
        }

        // Find maximum number of requests
        int max = 0;

        for (int c : count) {
            max = Math.max(max, c);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                ans.add(i);
            }
        }

        return ans;
    }
}
