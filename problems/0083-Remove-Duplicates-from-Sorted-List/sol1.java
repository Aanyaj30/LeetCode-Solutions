// ==========================================================
// 83. Remove Duplicates from Sorted List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.6 MB (Beats 98%)
// Link       : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}