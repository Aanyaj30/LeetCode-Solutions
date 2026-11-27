// ==========================================================
// 1304. Find N Unique Integers Sum up to Zero
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.9 MB (Beats 36%)
// Link       : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// ==========================================================

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num = 1;
        int i = 0;
        while (i < n - 1) {
            arr[i] = num;
            arr[i + 1] = -num;
            num++;
            i += 2;
        }
        if (n % 2 != 0) {
            arr[n - 1] = 0;
        }
        return arr;
    }
}