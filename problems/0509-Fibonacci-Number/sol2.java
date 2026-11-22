// ==========================================================
// 509. Fibonacci Number
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.6 MB (Beats 74%)
// Link       : https://leetcode.com/problems/fibonacci-number/
// ==========================================================

class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}