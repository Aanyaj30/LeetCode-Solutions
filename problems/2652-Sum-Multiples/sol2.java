// ==========================================================
// 2652. Sum Multiples
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 98%)
// Memory     : 42.2 MB (Beats 68%)
// Link       : https://leetcode.com/problems/sum-multiples/
// ==========================================================

class Solution {
    public int sumOfMultiples(int n) {
        //Inclusion-Exclusion Principle
        return sum(3, n) + sum(5, n) + sum(7, n)
             - sum(15, n) - sum(21, n) - sum(35, n)
             + sum(105, n);
    }

    public int sum(int d, int n) {
        int k = n / d;
        return d * k * (k + 1) / 2;
    }
}