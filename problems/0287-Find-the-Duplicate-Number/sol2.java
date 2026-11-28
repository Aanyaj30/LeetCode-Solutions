// ==========================================================
// 287. Find the Duplicate Number
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 4 ms (Beats 94%)
// Memory     : 82.4 MB (Beats 62%)
// Link       : https://leetcode.com/problems/find-the-duplicate-number/
// ==========================================================

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}