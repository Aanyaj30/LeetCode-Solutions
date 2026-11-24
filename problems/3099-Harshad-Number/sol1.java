// ==========================================================
// 3099. Harshad Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.6 MB (Beats 65%)
// Link       : https://leetcode.com/problems/harshad-number/
// ==========================================================

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int m=x;
        int sum=0;
        while(m!=0){
            int d= m%10;
            sum+=d;
            m = m/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}