// ==========================================================
// 3411. Maximum Subarray With Equal Products
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 97%)
// Memory     : 43.7 MB (Beats 85%)
// Link       : https://leetcode.com/problems/maximum-subarray-with-equal-products/
// ==========================================================

class Solution {
    public int maxLength(int[] nums) {
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            int gcd = nums[i];
            int lcm = nums[i];

            for(int j = i; j < nums.length; j++){
                prod *= nums[j];

                gcd = findGcd(gcd, nums[j]);
                lcm = findLcm(lcm, nums[j]);

                if(prod > 25200){
                    break;
                }

                if(prod == lcm * gcd){
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
    public int findGcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findLcm(int a, int b){
        return (a / findGcd(a, b)) * b;
    }
}