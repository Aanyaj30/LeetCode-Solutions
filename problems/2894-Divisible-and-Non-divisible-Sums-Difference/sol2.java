// ==========================================================
// 2894. Divisible and Non-divisible Sums Difference
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 97%)
// Memory     : 41.8 MB (Beats 94%)
// Link       : https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
// ==========================================================

class Solution {
    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        int k = n / m;
        int num2 = m * k * (k + 1) / 2;
        return total - 2 * num2;
    }
}