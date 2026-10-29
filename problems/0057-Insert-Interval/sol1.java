// ==========================================================
// 57. Insert Interval
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 46.3 MB (Beats 97%)
// Link       : https://leetcode.com/problems/insert-interval/
// ==========================================================

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> tempRes = new ArrayList<>();
        int i=0, n=intervals.length;
        //non-overlapping
        while(i<n && intervals[i][1] < newInterval[0]){
            tempRes.add(intervals[i]);
            i+=1;
        }
        //Overlapping
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i+=1;
        }
        tempRes.add(newInterval);
        //Non-overlapping
        while(i<n){
            tempRes.add(intervals[i]);
            i+=1;
        }
        return tempRes.toArray(new int[tempRes.size()][2]);
    }
}