// ==========================================================
// 92. Reverse Linked List II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.4 MB (Beats 91%)
// Link       : https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        // Reach the node before left
        for(int i = 1; i < left; i++) {
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode curr = temp.next;
        ListNode tail = curr;
        // Reverse only from left to right
        for(int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Reconnect the reversed portion
        temp.next = prev;
        tail.next = curr;
        return dummy.next;
    }
}
