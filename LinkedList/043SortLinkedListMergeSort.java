//https://leetcode.com/problems/sort-list/
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);
    
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);
        return mergeTwoSortedLinkedLists(left, right);
    }
    public ListNode findMiddle(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next; 
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }

}
