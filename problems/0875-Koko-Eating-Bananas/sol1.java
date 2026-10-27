// ==========================================================
// 875. Koko Eating Bananas
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 12 ms (Beats 50%)
// Memory     : 47.3 MB (Beats 94%)
// Link       : https://leetcode.com/problems/koko-eating-bananas/
// ==========================================================

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(piles, h, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean isValid(int[] piles, int h, int speed) {
        long noOfHours = 0;

        for (int pile : piles) {
            noOfHours += pile / speed;

            if (pile % speed != 0) {
                noOfHours++;
            }

            if (noOfHours > h) {
                return false;
            }
        }
        return true;
    }
}
