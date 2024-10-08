//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode fast = head;
        for(int i =0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        } 
        ListNode slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
