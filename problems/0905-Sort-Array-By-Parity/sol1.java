// ==========================================================
// 905. Sort Array By Parity
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 76%)
// Memory     : 46.2 MB (Beats 90%)
// Link       : https://leetcode.com/problems/sort-array-by-parity/
// ==========================================================

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
            }
        }
        return nums;
    }
}