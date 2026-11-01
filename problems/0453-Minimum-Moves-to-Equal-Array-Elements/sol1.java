// ==========================================================
// 453. Minimum Moves to Equal Array Elements
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 94%)
// Memory     : 46.6 MB (Beats 94%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// ==========================================================

class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            sum+=n;
            min = Math.min(min, n);
        }
        return sum-(nums.length*min);
    }
}