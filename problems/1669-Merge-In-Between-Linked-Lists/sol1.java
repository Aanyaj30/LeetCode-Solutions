// ==========================================================
// 1669. Merge In Between Linked Lists
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 31%)
// Memory     : 48.9 MB (Beats 82%)
// Link       : https://leetcode.com/problems/merge-in-between-linked-lists/
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode pointA = null;
        for(int i=0; i<=b; i++){
            if(i==a-1){
                pointA = temp;
            }
            temp = temp.next;
        }
        pointA.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = temp;
        return list1;
    }
}