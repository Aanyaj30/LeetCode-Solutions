// ==========================================================
// 1704. Determine if String Halves Are Alike
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 4 ms (Beats 75%)
// Memory     : 42.7 MB (Beats 56%)
// Link       : https://leetcode.com/problems/determine-if-string-halves-are-alike/
// ==========================================================

class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if(i < n / 2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count == 0;
    }
}