// ==========================================================
// 503. Next Greater Element II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 13 ms (Beats 66%)
// Memory     : 48.4 MB (Beats 44%)
// Link       : https://leetcode.com/problems/next-greater-element-ii/
// ==========================================================

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int nums[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-2; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            s.push(arr[i]);
        }
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nums[i] = -1;
            }else{
                nums[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nums;
    }
}