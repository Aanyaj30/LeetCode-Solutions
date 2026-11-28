// ==========================================================
// 3947. Maximum Number of Items From Sale II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 50 ms (Beats 47%)
// Memory     : 270.8 MB (Beats 6%)
// Link       : https://leetcode.com/problems/maximum-number-of-items-from-sale-ii/
// ==========================================================

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        // Count frequency of each factor
        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        // Count how many factors are multiples of each factor
        int[] total = new int[maxFactor + 1];

        for (int i = 1; i <= maxFactor; i++) {
            for (int j = i; j <= maxFactor; j += i) {
                total[i] += freq[j];
            }
        }

        // Collect useful bonus copies by price
        TreeMap<Integer, Long> bonus = new TreeMap<>();

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            int gain = total[factor] - 1;

            // A bonus purchase must be cheaper than
            // buying two normal items at minPrice.
            if (gain > 0 && price < 2L * minPrice) {
                bonus.put(price, bonus.getOrDefault(price, 0L) + gain);
            }
        }

        long remaining = budget;
        long ans = 0;

        // Buy bonus copies in ascending price order
        for (Map.Entry<Integer, Long> entry : bonus.entrySet()) {
            int price = entry.getKey();
            long count = entry.getValue();

            long take = Math.min(count, remaining / price);

            ans += take * 2;
            remaining -= take * price;
        }
        // Spend remaining budget on the cheapest normal item
        ans += remaining / minPrice;

        return (int) ans;
    }
}