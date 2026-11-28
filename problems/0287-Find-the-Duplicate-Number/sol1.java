// ==========================================================
// 287. Find the Duplicate Number
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 21 ms (Beats 34%)
// Memory     : 91.9 MB (Beats 10%)
// Link       : https://leetcode.com/problems/find-the-duplicate-number/
// ==========================================================

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }
}