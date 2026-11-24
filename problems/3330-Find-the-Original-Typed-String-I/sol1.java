// ==========================================================
// 3330. Find the Original Typed String I
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 92%)
// Memory     : 42.7 MB (Beats 82%)
// Link       : https://leetcode.com/problems/find-the-original-typed-string-i/
// ==========================================================

class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}