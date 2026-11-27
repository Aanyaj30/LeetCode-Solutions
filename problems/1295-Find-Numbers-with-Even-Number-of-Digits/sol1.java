// ==========================================================
// 1295. Find Numbers with Even Number of Digits
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 43.7 MB (Beats 98%)
// Link       : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// ==========================================================

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int x:nums){
            int digit=0;
            while(x!=0){
                digit++;
                x/=10;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}