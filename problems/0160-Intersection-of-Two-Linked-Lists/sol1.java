// ==========================================================
// 160. Intersection of Two Linked Lists
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1492 ms (Beats 5%)
// Memory     : 52.4 MB (Beats 82%)
// Link       : https://leetcode.com/problems/intersection-of-two-linked-lists/
// ==========================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headB != null){
            ListNode temp = headA;
            while(temp != null){
                if(temp == headB){
                    return headB;
                }
                temp = temp.next;
            }
            headB = headB.next;          
        }
        return null;
    }
}