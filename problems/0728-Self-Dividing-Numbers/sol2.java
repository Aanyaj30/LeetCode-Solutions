// ==========================================================
// 728. Self Dividing Numbers
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 99%)
// Memory     : 42.2 MB (Beats 69%)
// Link       : https://leetcode.com/problems/self-dividing-numbers/
// ==========================================================

class Solution {
    public boolean isTrue(int n) {
        int m = n;
        while(m > 0){
            int d = m % 10;
            if(d == 0 || n % d != 0){
                return false;
            }
            m /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isTrue(i)){
                list.add(i);
            }
        }
        return list;
    }
}