// ==========================================================
// 414. Third Maximum Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 99%)
// Memory     : 44.2 MB (Beats 90%)
// Link       : https://leetcode.com/problems/third-maximum-number/
// ==========================================================

class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;
        for(int x:nums){
            if(x>largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = x;
            }else if(x< largest && x> secondLargest){
                thirdLargest = secondLargest;
                secondLargest = x;
            }else if(x < secondLargest && x>thirdLargest){
                thirdLargest = x;
            }
        }
        return (int)(thirdLargest!=Long.MIN_VALUE? thirdLargest: largest);
    }
}