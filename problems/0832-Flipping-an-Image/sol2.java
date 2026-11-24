// ==========================================================
// 832. Flipping an Image
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.3 MB (Beats 77%)
// Link       : https://leetcode.com/problems/flipping-an-image/
// ==========================================================

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;

            while(left <= right){
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}