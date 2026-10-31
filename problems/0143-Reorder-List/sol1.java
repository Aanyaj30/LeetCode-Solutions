// ==========================================================
// 143. Reorder List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 88%)
// Memory     : 48.9 MB (Beats 84%)
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
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode leftH = head;
        ListNode rightH = prev;
        while(leftH!=null && rightH!=null){
            ListNode left = leftH.next;
            leftH.next = rightH;
            ListNode right = rightH.next;
            rightH.next = left;
            leftH = left;
            rightH = right;
        }
        
    }
}