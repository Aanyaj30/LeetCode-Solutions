// ==========================================================
// 2169. Count Operations to Obtain Zero
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 88%)
// Memory     : 41.8 MB (Beats 69%)
// Link       : https://leetcode.com/problems/count-operations-to-obtain-zero/
// ==========================================================

class Solution {
    public int countOperations(int num1, int num2) {
        int move=0;
        while(num1!=0 && num2!=0){
            if(num1>=num2){
                num1-=num2;
            }else{
                num2-=num1;
            }
            move++;
        }
        return move;
    }
}