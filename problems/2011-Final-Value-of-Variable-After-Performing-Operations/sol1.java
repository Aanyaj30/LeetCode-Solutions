// ==========================================================
// 2011. Final Value of Variable After Performing Operations
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 90%)
// Memory     : 43.8 MB (Beats 89%)
// Link       : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// ==========================================================

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String s:operations){
            if(s.equals("--X") || s.equals("X--")){
                X-=1;
            }else{
                X+=1;
            }
        }
        return X;
    }
}