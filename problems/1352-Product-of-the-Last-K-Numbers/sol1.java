// ==========================================================
// 1352. Product of the Last K Numbers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 18 ms (Beats 71%)
// Memory     : 84.2 MB (Beats 57%)
// Link       : https://leetcode.com/problems/product-of-the-last-k-numbers/
// ==========================================================

class ProductOfNumbers {
    ArrayList<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1);
    }

    public void add(int num) {
        if(num == 0) {
            prefix.clear();
            prefix.add(1);
        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }
    public int getProduct(int k) {
        if(k >= prefix.size()) {
            return 0;
        }
        int last = prefix.get(prefix.size() - 1);
        int before = prefix.get(prefix.size() - 1 - k);
        return last / before;
    }
}