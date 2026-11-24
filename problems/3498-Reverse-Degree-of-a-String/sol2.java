// ==========================================================
// 3498. Reverse Degree of a String
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 25%)
// Memory     : 43.5 MB (Beats 89%)
// Link       : https://leetcode.com/problems/reverse-degree-of-a-string/
// ==========================================================

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return sum;
    }
}