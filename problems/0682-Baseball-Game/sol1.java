// ==========================================================
// 682. Baseball Game
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 80%)
// Memory     : 42.6 MB (Beats 99%)
// Link       : https://leetcode.com/problems/baseball-game/
// ==========================================================

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String c:operations){
            if(c.equals("C")){
                s.pop();
            }else if(c.equals("D")){
                s.push(2*s.peek());
            }else if(c.equals("+")){
                int first = s.pop();
                int second = s.peek();
                int sum = first + second;
                s.push(first);  // restore first score
                s.push(sum);
            }else{
                s.push(Integer.parseInt(c));
            }
        }
        int result=0;
        while(!s.isEmpty()){
            result+=s.pop();
        }
        return result;
    }
}