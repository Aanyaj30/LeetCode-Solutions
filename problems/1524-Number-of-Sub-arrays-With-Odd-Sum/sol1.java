// ==========================================================
// 1524. Number of Sub-arrays With Odd Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 44%)
// Memory     : 85 MB (Beats 21%)
// Link       : https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
// ==========================================================

class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        long odd = 0;
        long even = 1;
        long prefix = 0;
        long ans = 0;
        for (int num : arr) {
            prefix += num;
            if (prefix % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
        }
        return (int)(ans % mod);
    }
}
