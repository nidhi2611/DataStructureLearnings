//https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode new_head = head;
        ListNode current = head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp.next!=null){
            current = temp.next;
            temp.next = current.next;
            current.next = new_head;
            new_head = current;
        }
        return new_head;
    }
}
