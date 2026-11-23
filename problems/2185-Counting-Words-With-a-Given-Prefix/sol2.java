// ==========================================================
// 2185. Counting Words With a Given Prefix
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.7 MB (Beats 86%)
// Link       : https://leetcode.com/problems/counting-words-with-a-given-prefix/
// ==========================================================

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s:words){
            if(s.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}