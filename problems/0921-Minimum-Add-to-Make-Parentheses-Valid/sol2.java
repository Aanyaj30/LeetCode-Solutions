// ==========================================================
// 921. Minimum Add to Make Parentheses Valid
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 22%)
// Memory     : 42.1 MB (Beats 99%)
// Link       : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// ==========================================================

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int moves=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')' && stack.isEmpty()){
                moves+=1;
            }else{
                stack.pop();
            }
        }
        return moves + stack.size();
    }
}