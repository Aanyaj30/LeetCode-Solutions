// ==========================================================
// 1512. Number of Good Pairs
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.6 MB (Beats 67%)
// Link       : https://leetcode.com/problems/number-of-good-pairs/
// ==========================================================


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }
}
