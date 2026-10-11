// ==========================================================
// 3090. Maximum Length Substring With Two Occurrences
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 34%)
// Memory     : 43.9 MB (Beats 33%)
// Link       : https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
// ==========================================================

class Solution {
    public int maximumLengthSubstring(String s) {
        int start=0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        for(int end=0; end<s.length(); end++){
            char curr = s.charAt(end);
            map.put(curr, map.getOrDefault(curr, 0) +1);
            while(map.get(curr) > 2){
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                start += 1;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
        
    }
}