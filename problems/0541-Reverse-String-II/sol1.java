// ==========================================================
// 541. Reverse String II
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 99%)
// Memory     : 44.2 MB (Beats 75%)
// Link       : https://leetcode.com/problems/reverse-string-ii/
// ==========================================================

class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i += 2*k){
            int left = i;
            int right = Math.min(i+k-1, arr.length-1);

            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}