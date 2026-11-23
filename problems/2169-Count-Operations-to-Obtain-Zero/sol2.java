// ==========================================================
// 2169. Count Operations to Obtain Zero
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.8 MB (Beats 69%)
// Link       : https://leetcode.com/problems/count-operations-to-obtain-zero/
// ==========================================================

class Solution {
    public int countOperations(int num1, int num2) {
        int move = 0;
        while(num1 != 0 && num2 != 0) {
            if(num1 >= num2) {
                move += num1 / num2;
                num1 %= num2;
            } else {
                move += num2 / num1;
                num2 %= num1;
            }
        }
        return move;
    }
}