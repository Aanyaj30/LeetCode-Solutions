// ==========================================================
// 1832. Check if the Sentence Is Pangram
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 88%)
// Memory     : 42.5 MB (Beats 68%)
// Link       : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// ==========================================================

class Solution {
    public boolean checkIfPangram(String sentence) {
        int charArr[] = new int[26];
        for(char ch:sentence.toCharArray()){
            charArr[ch-'a']++;
        }
        for(int x:charArr){
            if(x==0){
                return false;
            }
        }
        return true;
    }
}