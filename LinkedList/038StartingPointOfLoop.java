//https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode res = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;  
            if (slow == fast) {
                slow = head; 
                while (slow != fast) {
                    slow = slow.next;  
                    fast = fast.next;  
                }
                return slow;
            }
        } 
        return res;
    }
}
