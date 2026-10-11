// ==========================================================
// 2958. Length of Longest Subarray With at Most K Frequency
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 66 ms (Beats 71%)
// Memory     : 88.8 MB (Beats 71%)
// Link       : https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
// ==========================================================

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start=0;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int end=0; end<nums.length; end++){
            int curr = nums[end];
            map.put(curr, map.getOrDefault(curr, 0) +1);
            while(map.get(curr) > k){
                int num = nums[start];
                map.put(num, map.get(num)-1);
                start += 1;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}