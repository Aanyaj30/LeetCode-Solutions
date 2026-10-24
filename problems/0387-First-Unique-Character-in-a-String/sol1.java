// ==========================================================
// 387. First Unique Character in a String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 59%)
// Memory     : 46.5 MB (Beats 92%)
// Link       : https://leetcode.com/problems/first-unique-character-in-a-string/
// ==========================================================

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}