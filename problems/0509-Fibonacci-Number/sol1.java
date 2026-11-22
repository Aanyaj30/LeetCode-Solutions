// ==========================================================
// 509. Fibonacci Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 9 ms (Beats 41%)
// Memory     : 41.7 MB (Beats 63%)
// Link       : https://leetcode.com/problems/fibonacci-number/
// ==========================================================

class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}