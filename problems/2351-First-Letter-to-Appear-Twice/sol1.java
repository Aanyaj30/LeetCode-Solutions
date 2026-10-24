// ==========================================================
// 2351. First Letter to Appear Twice
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.5 MB (Beats 91%)
// Link       : https://leetcode.com/problems/first-letter-to-appear-twice/
// ==========================================================

class Solution {
    public char repeatedCharacter(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i)-'a';
            freq[index]++;
            if(freq[index] == 2){
                return s.charAt(i);
            }
        }
        return '\0';
    }
}