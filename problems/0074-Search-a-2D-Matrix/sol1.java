// ==========================================================
// 74. Search a 2D Matrix
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.1 MB (Beats 98%)
// Link       : https://leetcode.com/problems/search-a-2d-matrix/
// ==========================================================

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n - 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int currElement = matrix[mid/n][mid%n];
            if(currElement == target){
                return true;
            }else if(currElement < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}