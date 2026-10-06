// ==========================================================
// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 27%)
// Memory     : 72.1 MB (Beats 8%)
// Link       : https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// ==========================================================

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0, sum = 0, count=0;
        for(int end = 0; end < arr.length; end++){
            sum += arr[end];
            if(end - start + 1 == k){
                if((double)sum/k >= threshold){
                    count++;
                }
                sum -= arr[start];
                start += 1;
            }
        }
        return count;
    }
}