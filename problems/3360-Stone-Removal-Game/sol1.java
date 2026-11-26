// ==========================================================
// 3360. Stone Removal Game
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.7 MB (Beats 60%)
// Link       : https://leetcode.com/problems/stone-removal-game/
// ==========================================================

class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceTurn = true;

        while (remove > 0) {
            if (n < remove) {
                return !aliceTurn;
            }

            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;
        }

        return false;
    }
}