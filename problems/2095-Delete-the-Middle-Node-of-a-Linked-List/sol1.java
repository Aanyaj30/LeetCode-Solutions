// ==========================================================
// 2095. Delete the Middle Node of a Linked List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 26%)
// Memory     : 202.3 MB (Beats 73%)
// Link       : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}