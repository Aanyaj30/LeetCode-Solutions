// ==========================================================
// 2540. Minimum Common Value
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 7 ms (Beats 22%)
// Memory     : 79.7 MB (Beats 90%)
// Link       : https://leetcode.com/problems/minimum-common-value/
// ==========================================================

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int x : nums1){
            int left = 0, right = nums2.length - 1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums2[mid] == x){
                    return x;
                }
                else if(nums2[mid] < x){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}