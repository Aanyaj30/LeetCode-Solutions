// ==========================================================
// 1512. Number of Good Pairs
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 85%)
// Memory     : 42.4 MB (Beats 82%)
// Link       : https://leetcode.com/problems/number-of-good-pairs/
// ==========================================================

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}