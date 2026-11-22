// ==========================================================
// 771. Jewels and Stones
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 77%)
// Memory     : 42.9 MB (Beats 46%)
// Link       : https://leetcode.com/problems/jewels-and-stones/
// ==========================================================

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}