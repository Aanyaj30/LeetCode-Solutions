// ==========================================================
// 463. Island Perimeter
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 9 ms (Beats 49%)
// Memory     : 46.3 MB (Beats 98%)
// Link       : https://leetcode.com/problems/island-perimeter/
// ==========================================================

class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    // Top
                    if(i == 0 || grid[i-1][j] == 0)
                        count++;
                    // Bottom
                    if(i == grid.length-1 || grid[i+1][j] == 0)
                        count++;
                    // Left
                    if(j == 0 || grid[i][j-1] == 0)
                        count++;
                    // Right
                    if(j == grid[i].length-1 || grid[i][j+1] == 0)
                        count++;
                }
            }
        }
        return count;
    }
}