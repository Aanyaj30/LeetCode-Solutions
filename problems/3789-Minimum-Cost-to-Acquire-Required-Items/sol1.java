// ==========================================================
// 3789. Minimum Cost to Acquire Required Items
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 41%)
// Memory     : 42.2 MB (Beats 85%)
// Link       : https://leetcode.com/problems/minimum-cost-to-acquire-required-items/
// ==========================================================

class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        // Option 1: Buy separate items
        long costSeparate = (long) need1 * cost1 + (long) need2 * cost2;
        // Option 2: Buy only type 3 items
        long costOnlyBoth = (long) Math.max(need1, need2) * costBoth;
        // Option 3: Buy type 3 for common requirement,
        // then buy separate items for the remaining requirement
        long common = Math.min(need1, need2);
        long costMixed = common * costBoth
                       + (long) (need1 - common) * cost1
                       + (long) (need2 - common) * cost2;
        return Math.min(costSeparate, Math.min(costOnlyBoth, costMixed));
    }
}
