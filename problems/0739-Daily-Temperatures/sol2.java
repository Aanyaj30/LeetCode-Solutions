// ==========================================================
// 739. Daily Temperatures
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 77 ms (Beats 23%)
// Memory     : 106.2 MB (Beats 68%)
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
            if (s.isEmpty()) {
                arr[i]=0;
            }else{
                arr[i] = s.peek() - i;
            }
            s.push(i);
        }
        return arr;
    }
}
