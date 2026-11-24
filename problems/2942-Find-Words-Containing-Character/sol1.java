// ==========================================================
// 2942. Find Words Containing Character
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 82%)
// Memory     : 46.2 MB (Beats 58%)
// Link       : https://leetcode.com/problems/find-words-containing-character/
// ==========================================================

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
}