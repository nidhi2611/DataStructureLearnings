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
    public ListNode reverseList(ListNode head) {
        // ListNode temp = head;
        // ListNode new_head = head;
        // ListNode current = head;
        // if(head == null || head.next == null){
        //     return head;
        // }
        // while(temp.next!=null){
        //     current = temp.next;
        //     temp.next = current.next;
        //     current.next = new_head;
        //     new_head = current;
        // }
        if(head == null || head.next == null)
            return head;
        else
            return recursiveReverse(head,head,head);
    }
    public ListNode recursiveReverse(ListNode temp, ListNode current,ListNode new_head){
        if(temp.next!=null){
            current = temp.next;
            temp.next = current.next;
            current.next = new_head;
            new_head = current;
            recursiveReverse(temp,current,new_head);
        }
        return new_head;
    }
}
