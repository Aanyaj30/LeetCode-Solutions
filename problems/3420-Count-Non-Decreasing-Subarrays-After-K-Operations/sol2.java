// ==========================================================
// 3420. Count Non-Decreasing Subarrays After K Operations
// Difficulty : Hard
// Language   : Java
// Solution   : #2
// Runtime    : 55 ms (Beats 36%)
// Memory     : 136.5 MB (Beats 46%)
// Link       : https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/
// ==========================================================


class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        long ans = 0;
        long operations = 0;

        int[] pos = new int[n];
        Arrays.fill(pos, n);

        // Linked lists using arrays
        int[] head = new int[n];
        int[] tail = new int[n];
        int[] next = new int[n];

        Arrays.fill(head, -1);
        Arrays.fill(tail, -1);
        Arrays.fill(next, -1);

        // Monotonic stack
        Deque<Integer> st = new ArrayDeque<>();

        // Monotonic deque for maximum
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int left = 0;

        for (int right = 0; right < n; right++) {

            // Maintain decreasing monotonic stack
            while (!st.isEmpty() &&
                   nums[right] >= nums[st.peek()]) {

                pos[st.pop()] = right;
            }

            if (!st.isEmpty()) {
                int p = st.peek();

                if (head[p] == -1) {
                    head[p] = right;
                } else {
                    next[tail[p]] = right;
                }

                tail[p] = right;
            }

            st.push(right);

            // Maintain maximum using deque
            while (!maxDeque.isEmpty() &&
                   nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }

            maxDeque.offerLast(right);

            // Add operation cost
            operations +=
                (long) nums[maxDeque.peekFirst()] - nums[right];

            // Shrink window
            while (operations > k) {

                for (int i = head[left]; i != -1; i = next[i]) {

                    operations -=
                        (long) (nums[left] - nums[i]) *
                        (Math.min(pos[i], right + 1) - i);
                }

                left++;
            }

            // Remove expired indices
            while (!maxDeque.isEmpty() &&
                   maxDeque.peekFirst() < left) {
                maxDeque.pollFirst();
            }

            ans += right - left + 1L;
        }

        return ans;
    }
}
