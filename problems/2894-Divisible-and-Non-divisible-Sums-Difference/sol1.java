// ==========================================================
// 2894. Divisible and Non-divisible Sums Difference
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 97%)
// Memory     : 42 MB (Beats 69%)
// Link       : https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
// ==========================================================

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0, num2=0;
        for(int i=1; i<=n; i++){
            if(i%m!=0){
                num1+=i;
            }else{
                num2+=i;
            }
        }
        return num1-num2;
    }
}