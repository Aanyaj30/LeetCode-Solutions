// ==========================================================
// 462. Minimum Moves to Equal Array Elements II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 11 ms (Beats 34%)
// Memory     : 46.8 MB (Beats 80%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
// ==========================================================

import java.util.Arrays;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            moves += Math.abs(nums[i] - median);
        }
        return moves;
    }
}