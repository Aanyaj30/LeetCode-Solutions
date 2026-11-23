// ==========================================================
// 2652. Sum Multiples
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 95%)
// Memory     : 42.1 MB (Beats 68%)
// Link       : https://leetcode.com/problems/sum-multiples/
// ==========================================================

class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}