// ==========================================================
// 1304. Find N Unique Integers Sum up to Zero
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 1%)
// Memory     : 43.1 MB (Beats 28%)
// Link       : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// ==========================================================

class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n%2!=0){
            list.add(0);
        }
        int i=1;
        while(list.size()<n){
            list.add(i);
            list.add(-1*i);
            i++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}