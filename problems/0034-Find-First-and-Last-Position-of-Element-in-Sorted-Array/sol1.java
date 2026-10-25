// ==========================================================
// 34. Find First and Last Position of Element in Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47.9 MB (Beats 85%)
// Link       : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// ==========================================================

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[]{first, last};
    }
    private int findPosition(int[] nums, int target, boolean isFirst){
        int low=0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isFirst){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}