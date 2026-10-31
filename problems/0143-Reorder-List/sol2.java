// ==========================================================
// 143. Reorder List
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 100%)
// Memory     : 48.6 MB (Beats 96%)
// Link       : https://leetcode.com/problems/reorder-list/
// ==========================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Split the list
        ListNode curr = slow.next;
        slow.next = null;

        // Step 3: Reverse second half
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Step 4: Merge both halves
        ListNode leftH = head;
        ListNode rightH = prev;

        while (rightH != null) {
            ListNode left = leftH.next;
            ListNode right = rightH.next;

            leftH.next = rightH;
            rightH.next = left;

            leftH = left;
            rightH = right;
        }
    }
}
