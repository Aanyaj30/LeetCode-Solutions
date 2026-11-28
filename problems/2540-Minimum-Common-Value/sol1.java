// ==========================================================
// 2540. Minimum Common Value
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 95%)
// Memory     : 80.2 MB (Beats 61%)
// Link       : https://leetcode.com/problems/minimum-common-value/
// ==========================================================

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}