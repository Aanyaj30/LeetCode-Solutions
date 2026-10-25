// ==========================================================
// 1011. Capacity To Ship Packages Within D Days
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 10 ms (Beats 77%)
// Memory     : 49.8 MB (Beats 86%)
// Link       : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// ==========================================================

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0, high=0;
        for(int weight:weights){
            low = Math.max(low, weight);
            high += weight;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(weights, days, mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
        }
        private boolean isValid(int[] weights, int days, int capacity){
            int d = 1, currWeight = 0;
            for(int weight:weights){
                currWeight += weight;
                if(currWeight > capacity){
                    currWeight = weight;
                    d+=1;
                }
        }
        return d <= days;      
    }
}