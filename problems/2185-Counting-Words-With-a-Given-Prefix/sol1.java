// ==========================================================
// 2185. Counting Words With a Given Prefix
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.7 MB (Beats 79%)
// Link       : https://leetcode.com/problems/counting-words-with-a-given-prefix/
// ==========================================================

class Solution {
    public int prefixCount(String[] words, String pref) {
        int moves=0;
        for(String s:words){
            if(s.startsWith(pref)){
                moves++;
            }
        }
        return moves;
    }
}