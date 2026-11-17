// ==========================================================
// 1047. Remove All Adjacent Duplicates In String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 25 ms (Beats 56%)
// Memory     : 46.5 MB (Beats 80%)
// Link       : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// ==========================================================

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}