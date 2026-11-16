// ==========================================================
// 921. Minimum Add to Make Parentheses Valid
// Difficulty : Medium
// Language   : Java
// Solution   : #3
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.4 MB (Beats 94%)
// Link       : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// ==========================================================

class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int moves = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (open > 0) {
                open--;
            } else {
                moves++;
            }
        }
        return moves + open;
    }
}