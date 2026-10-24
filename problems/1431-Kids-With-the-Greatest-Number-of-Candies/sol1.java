// ==========================================================
// 1431. Kids With the Greatest Number of Candies
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 95%)
// Memory     : 43.4 MB (Beats 94%)
// Link       : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// ==========================================================

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int n:candies){
            max = Math.max(n, max);
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}