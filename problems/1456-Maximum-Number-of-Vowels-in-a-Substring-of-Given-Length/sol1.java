// ==========================================================
// 1456. Maximum Number of Vowels in a Substring of Given Length
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 15 ms (Beats 42%)
// Memory     : 46.6 MB (Beats 36%)
// Link       : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// ==========================================================

class Solution {
    public int maxVowels(String s, int k) {
        int start=0, count=0;
        int maxCount=0;
        for(int end = 0; end < s.length(); end++){
            if(isVowel(s.charAt(end))){
                count++;
            }
            if(end-start+1 == k){ 
                maxCount = Math.max(count, maxCount);
                if(isVowel(s.charAt(start))){
                    count--;
                }
                start+=1;
            }
        }
        return maxCount;  
    }
    private Boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}