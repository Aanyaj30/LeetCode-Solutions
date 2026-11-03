// ==========================================================
// 3736. Minimum Moves to Equal Array Elements III
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 30%)
// Memory     : 45.9 MB (Beats 89%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/
// ==========================================================

class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            max = Math.max(num, max);
        }
        int count=0;
        for(int num:nums){
            count+= Math.abs(max - num);
        }
        return count;
    }
}