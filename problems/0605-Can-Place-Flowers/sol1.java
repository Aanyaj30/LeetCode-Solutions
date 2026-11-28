// ==========================================================
// 605. Can Place Flowers
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 47.4 MB (Beats 45%)
// Link       : https://leetcode.com/problems/can-place-flowers/
// ==========================================================

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty = (i == 0 || flowerbed[i-1] == 0);
                boolean rightEmpty = (i == flowerbed.length-1 || flowerbed[i+1] == 0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            if(n <= 0){
                return true;
            }
        }
        return false;
    }
}