// ==========================================================
// 442. Find All Duplicates in an Array
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 6 ms (Beats 93%)
// Memory     : 57.3 MB (Beats 82%)
// Link       : https://leetcode.com/problems/find-all-duplicates-in-an-array/
// ==========================================================

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }
}