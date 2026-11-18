// ==========================================================
// 739. Daily Temperatures
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 78 ms (Beats 16%)
// Memory     : 106.2 MB (Beats 71%)
// Link       : https://leetcode.com/problems/daily-temperatures/
// ==========================================================

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && 
                   temperatures[s.peek()] <= temperatures[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                arr[i] = s.peek() - i;
            }
            s.push(i);
        }
        return arr;
    }
}
