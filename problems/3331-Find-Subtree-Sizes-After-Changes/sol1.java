// ==========================================================
// 3331. Find Subtree Sizes After Changes
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 146 ms (Beats 74%)
// Memory     : 274.5 MB (Beats 60%)
// Link       : https://leetcode.com/problems/find-subtree-sizes-after-changes/
// ==========================================================

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        // 1. Build the original tree
        List<Integer>[] original = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            original[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            original[parent[i]].add(i);
        }
        // 2. Find the new parent of every node
        int[] newParent = parent.clone();
        int[] nearest = new int[26];
        Arrays.fill(nearest, -1);

        int[] prev = new int[n];

        // Stack stores enter/exit events
        int[] stack = new int[2 * n];
        int top = 0;
        stack[top++] = 0;

        while (top > 0) {
            int event = stack[--top];

            // Exit event
            if (event < 0) {
                int node = -event - 1;
                nearest[s.charAt(node) - 'a'] = prev[node];
                continue;
            }

            // Enter event
            int node = event;
            int ch = s.charAt(node) - 'a';

            prev[node] = nearest[ch];

            if (node != 0 && nearest[ch] != -1) {
                newParent[node] = nearest[ch];
            }

            nearest[ch] = node;

            // Push exit event
            stack[top++] = -(node + 1);

            // Push children
            for (int child : original[node]) {
                stack[top++] = child;
            }
        }

        // 3. Build the modified tree
        List<Integer>[] modified = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            modified[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            modified[newParent[i]].add(i);
        }

        // 4. Traverse modified tree to get postorder
        int[] order = new int[n];
        top = 0;
        int count = 0;

        stack[top++] = 0;

        while (top > 0) {
            int node = stack[--top];
            order[count++] = node;

            for (int child : modified[node]) {
                stack[top++] = child;
            }
        }

        // 5. Calculate subtree sizes in reverse order
        int[] answer = new int[n];
        Arrays.fill(answer, 1);

        for (int i = n - 1; i > 0; i--) {
            int node = order[i];
            answer[newParent[node]] += answer[node];
        }

        return answer;
    }
}