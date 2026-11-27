// ==========================================================
// 1281. Subtract the Product and Sum of Digits of an Integer
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.3 MB (Beats 97%)
// Link       : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// ==========================================================

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, product=1;
        while(n!=0){
            int d = n%10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return product-sum;
    }
}