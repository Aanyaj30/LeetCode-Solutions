// ==========================================================
// 1768. Merge Strings Alternately
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 42.9 MB (Beats 41%)
// Link       : https://leetcode.com/problems/merge-strings-alternately/
// ==========================================================

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());
        for(int i = 0; i < n; i++) {
            if(i < word1.length())
                sb.append(word1.charAt(i));

            if(i < word2.length())
                sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}