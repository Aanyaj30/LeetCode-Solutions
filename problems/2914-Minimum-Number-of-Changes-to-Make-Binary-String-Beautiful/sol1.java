// ==========================================================
// 2914. Minimum Number of Changes to Make Binary String Beautiful
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 98%)
// Memory     : 46 MB (Beats 87%)
// Link       : https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
// ==========================================================

class Solution {
    public int minChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
