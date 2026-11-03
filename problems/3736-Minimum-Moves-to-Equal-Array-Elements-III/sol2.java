// ==========================================================
// 3736. Minimum Moves to Equal Array Elements III
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 30%)
// Memory     : 45.8 MB (Beats 89%)
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
            count+= max - num;
        }
        return count;
    }
}