// ==========================================================
// 445. Add Two Numbers II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 59%)
// Memory     : 46.1 MB (Beats 87%)
// Link       : https://leetcode.com/problems/add-two-numbers-ii/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newl1 = reverse(l1);
        ListNode newl2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry=0;
        while(newl1!=null || newl2!=null || carry!=0){
            int sum=0;
            if(newl1!=null){
                sum += newl1.val;
                newl1 = newl1.next;
            }
            if(newl2!=null){
                sum += newl2.val;
                newl2 = newl2.next;
            }
            sum += carry;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            carry = sum/10;
        }
        return reverse(dummy.next);  
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}