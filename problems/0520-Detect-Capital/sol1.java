// ==========================================================
// 520. Detect Capital
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 95%)
// Memory     : 43.1 MB (Beats 41%)
// Link       : https://leetcode.com/problems/detect-capital/
// ==========================================================

class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char ch: word.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(count==0 || count==word.length()){
            return true;
        }if(count == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}