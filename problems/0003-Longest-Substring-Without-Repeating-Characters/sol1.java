// ==========================================================
// 3. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 75 ms (Beats 17%)
// Memory     : 48 MB (Beats 42%)
// Link       : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// ==========================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int end=0; end<s.length(); end++){
            char curr = s.charAt(end);
            map.put(curr, map.getOrDefault(curr, 0)+1);
            while(map.get(curr) >= 2){
                char ch = s.charAt(start);
                map.put(ch, map.get(ch)-1);
                start += 1;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}