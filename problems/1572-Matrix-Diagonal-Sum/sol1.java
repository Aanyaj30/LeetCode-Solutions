// ==========================================================
// 1572. Matrix Diagonal Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.9 MB (Beats 60%)
// Link       : https://leetcode.com/problems/matrix-diagonal-sum/
// ==========================================================

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
            if(i!=n-1-i){
                sum += mat[i][n-i-1];
            }
        }
        return sum;     
    }
}