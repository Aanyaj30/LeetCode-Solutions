// ==========================================================
// 1385. Find the Distance Value Between Two Arrays
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 7 ms (Beats 30%)
// Memory     : 46.5 MB (Beats 24%)
// Link       : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
// ==========================================================

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        int j = 0;
        for (int x : arr1) {
            while (j < arr2.length && arr2[j] < x - d) {
                j++;
            }
            if (j == arr2.length || arr2[j] > x + d) {
                count++;
            }
        }
        return count;
    }
}