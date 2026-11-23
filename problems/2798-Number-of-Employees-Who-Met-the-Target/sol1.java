// ==========================================================
// 2798. Number of Employees Who Met the Target
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 65%)
// Memory     : 43.6 MB (Beats 76%)
// Link       : https://leetcode.com/problems/number-of-employees-who-met-the-target/
// ==========================================================

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int total = 0;
        for(int x:hours){
            if(x>=target){
                total++;
            }
        }
        return total;
    }
}