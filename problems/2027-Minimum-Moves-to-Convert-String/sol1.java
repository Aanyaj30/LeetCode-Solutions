// ==========================================================
// 2027. Minimum Moves to Convert String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 83%)
// Memory     : 42.4 MB (Beats 53%)
// Link       : https://leetcode.com/problems/minimum-moves-to-convert-string/
// ==========================================================

class Solution {
    public int minimumMoves(String s) {
        int move = 0;
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == 'X') {
                move++;
                i += 3;
            } else {
                i++;
            }
        }
        return move;
    }
}