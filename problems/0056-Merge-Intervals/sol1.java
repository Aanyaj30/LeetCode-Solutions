// ==========================================================
// 56. Merge Intervals
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 9 ms (Beats 35%)
// Memory     : 48.5 MB (Beats 91%)
// Link       : https://leetcode.com/problems/merge-intervals/
// ==========================================================

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        ArrayList<int[]> tempResult = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            //overlapping
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{//non-overlapping
                tempResult.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        tempResult.add(new int[] {start, end});
        int[][] finalRes = new int[tempResult.size()][2];
        int index=0;
        for(int[] interval:tempResult){
            finalRes[index++] = interval;
        }
        return finalRes;
    }
}