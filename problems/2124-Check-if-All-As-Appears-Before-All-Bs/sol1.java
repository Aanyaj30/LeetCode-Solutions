// ==========================================================
// 2124. Check if All A's Appears Before All B's
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 55%)
// Memory     : 42.4 MB (Beats 69%)
// Link       : https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
// ==========================================================

class Solution {
    public boolean checkString(String s) {
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='b' && s.charAt(i+1) == 'a'){
                return false;
            }
        }
        return true;
        
    }
}