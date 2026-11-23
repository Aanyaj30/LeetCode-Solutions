// ==========================================================
// 2413. Smallest Even Multiple
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.8 MB (Beats 57%)
// Link       : https://leetcode.com/problems/smallest-even-multiple/
// ==========================================================

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0){
            return n*2;
        }else{
            return n;
        }  
    }
}