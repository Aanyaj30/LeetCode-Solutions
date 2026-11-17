// ==========================================================
// 442. Find All Duplicates in an Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 34 ms (Beats 7%)
// Memory     : 70.5 MB (Beats 32%)
// Link       : https://leetcode.com/problems/find-all-duplicates-in-an-array/
// ==========================================================

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:nums){
            if(map.get(x) == 2){
                list.add(x);
                map.put(x,1);
            }
        }
        return list;
    }
}