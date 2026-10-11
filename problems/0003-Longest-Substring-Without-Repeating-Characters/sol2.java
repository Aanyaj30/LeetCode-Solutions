// ==========================================================
// 3. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 45 ms (Beats 70%)
// Memory     : 48.1 MB (Beats 26%)
// Link       : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// ==========================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        for (int end = 0; end < s.length(); end++) {
            char curr = s.charAt(end);
            if (map.containsKey(curr) && map.get(curr) >= start) {
                start = map.get(curr) + 1;
            }
            map.put(curr, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
