// ==========================================================
// 3934. Smallest Unique Subarray
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 931 ms (Beats 25%)
// Memory     : 277.4 MB (Beats 11%)
// Link       : https://leetcode.com/problems/smallest-unique-subarray/
// ==========================================================

import java.util.*;

class Solution {

    long mod1 = 1000000007L;
    long mod2 = 1000000009L;
    long base = 100001L;

    long[] hash1, hash2, pow1, pow2;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        hash1 = new long[n + 1];
        hash2 = new long[n + 1];
        pow1 = new long[n + 1];
        pow2 = new long[n + 1];

        pow1[0] = 1;
        pow2[0] = 1;

        for (int i = 0; i < n; i++) {
            pow1[i + 1] = (pow1[i] * base) % mod1;
            pow2[i + 1] = (pow2[i] * base) % mod2;

            hash1[i + 1] = (hash1[i] * base + nums[i]) % mod1;
            hash2[i + 1] = (hash2[i] * base + nums[i]) % mod2;
        }

        int low = 1, high = n, ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (check(mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    boolean check(int len) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i + len <= hash1.length - 1; i++) {
            int j = i + len;

            long h1 = (hash1[j] - hash1[i] * pow1[len] % mod1 + mod1) % mod1;
            long h2 = (hash2[j] - hash2[i] * pow2[len] % mod2 + mod2) % mod2;

            String key = h1 + "_" + h2;

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq == 1)
                return true;
        }

        return false;
    }
}