// ==========================================================
// 1870. Minimum Speed to Arrive on Time
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 134 ms (Beats 48%)
// Memory     : 98.7 MB (Beats 96%)
// Link       : https://leetcode.com/problems/minimum-speed-to-arrive-on-time/
// ==========================================================

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1, high=10000000;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(dist, hour, mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (low==10000001 ? -1: low);
    }
    private boolean isValid(int[] dist, double hour, int speed){
        double noOfHours = 0;
        for(int i=0; i<dist.length-1; i++){
            noOfHours += Math.ceil((double)dist[i]/(double)speed);
        }
        noOfHours += (double)dist[dist.length-1]/(double)speed;
        return noOfHours <= hour;
    }
}