// ==========================================================
// 1876. Substrings of Size Three with Distinct Characters
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 96%)
// Memory     : 42.6 MB (Beats 88%)
// Link       : https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
// ==========================================================

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0; i<=s.length()-3; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a!=b && b!=c && c!=a){
                count++;
            }
        }
        return count;
    }
}