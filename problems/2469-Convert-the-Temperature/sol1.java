// ==========================================================
// 2469. Convert the Temperature
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.7 MB (Beats 52%)
// Link       : https://leetcode.com/problems/convert-the-temperature/
// ==========================================================

class Solution {
    public double[] convertTemperature(double celsius) {
        double kel = celsius + 273.15;
        double fah = celsius*1.80 + 32.00;
        return new double[]{kel, fah};    
    }
}