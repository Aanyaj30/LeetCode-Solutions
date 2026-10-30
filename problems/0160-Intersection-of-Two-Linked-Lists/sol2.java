// ==========================================================
// 160. Intersection of Two Linked Lists
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 100%)
// Memory     : 52.3 MB (Beats 88%)
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
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            if(pA == null){
                pA = headB;
            }else{
                pA = pA.next;
            }
            if(pB == null){
                pB = headA;
            }else{
                pB = pB.next;
            }
        }
        return pB;
    }
}