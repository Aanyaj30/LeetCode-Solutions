// ==========================================================
// 1095. Find in Mountain Array
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.2 MB (Beats 93%)
// Link       : https://leetcode.com/problems/find-in-mountain-array/
// ==========================================================

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // 1. Find the peak
        int peak = findPeak(mountainArr, n);

        // 2. Search in increasing part
        int leftResult = binarySearchIncreasing(mountainArr, target, 0, peak);

        if (leftResult != -1) {
            return leftResult;
        }

        // 3. Search in decreasing part
        return binarySearchDecreasing(mountainArr, target, peak + 1, n - 1);
    }

    // Finds peak index
    private int findPeak(MountainArray arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                // We are on increasing side
                low = mid + 1;
            } else {
                // We are on decreasing side or at peak
                high = mid;
            }
        }

        return low;
    }

    // Binary search on increasing part
    private int binarySearchIncreasing(
            MountainArray arr, int target, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Binary search on decreasing part
    private int binarySearchDecreasing(
            MountainArray arr, int target, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } else if (value > target) {
                // In decreasing array, move right
                low = mid + 1;
            } else {
                // Move left
                high = mid - 1;
            }
        }

        return -1;
    }
}