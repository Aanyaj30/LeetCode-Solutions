// ==========================================================
// 2243. Calculate Digit Sum of a String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 99%)
// Memory     : 42.5 MB (Beats 84%)
// Link       : https://leetcode.com/problems/calculate-digit-sum-of-a-string/
// ==========================================================

class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder result = new StringBuilder();
            // Divide string into groups of size k
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                // Calculate sum of digits in current group
                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }
                // Add sum to the new string
                result.append(sum);
            }
            s = result.toString();
        }
        return s;
    }
}
