// ==========================================================
// 1385. Find the Distance Value Between Two Arrays
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 17 ms (Beats 5%)
// Memory     : 45.5 MB (Beats 96%)
// Link       : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
// ==========================================================

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0; i<arr1.length; i++){
            Boolean isValid = true;
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <=d){
                    isValid = false;
                }
            }
            if(isValid){
                count++;
            }
        }
        return count;
    }
}