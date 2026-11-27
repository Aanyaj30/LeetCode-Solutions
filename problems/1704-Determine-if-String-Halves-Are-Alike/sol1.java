// ==========================================================
// 1704. Determine if String Halves Are Alike
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 75%)
// Memory     : 42.4 MB (Beats 93%)
// Link       : https://leetcode.com/problems/determine-if-string-halves-are-alike/
// ==========================================================

class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int countA=0, countB=0;
        int n = s.length();
        for(int i = 0; i<n/2; i++){
            if(isVowel(Character.toLowerCase(s.charAt(i)))) {
                countA++;
            }
        }for(int i = n/2; i<n; i++){
            if(isVowel(Character.toLowerCase(s.charAt(i)))) {
                countB++;
            }
        }
        return countA==countB;
    }
}