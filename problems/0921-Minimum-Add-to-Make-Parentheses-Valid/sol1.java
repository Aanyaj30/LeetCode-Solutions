// ==========================================================
// 921. Minimum Add to Make Parentheses Valid
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 48%)
// Memory     : 42.3 MB (Beats 98%)
// Link       : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// ==========================================================

class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int moves=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open+=1;
            }else if(ch==')' && open==0){
                moves+=1;
            }else{
                open-=1;
            }
        }
        return moves + open;
    }
}