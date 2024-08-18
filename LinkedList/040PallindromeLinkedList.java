//https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        String str1 = "",str2="";
        boolean result = false;
        ListNode temp = head;
        if (head == null || head.next == null){
            return true;
        }else{
            ListNode slow = head;
            ListNode fast = head;
            while(fast !=null && fast.next != null ){
                str1 = str1 + slow.val;
                slow = slow.next;
                fast = fast.next.next;
            }
            while(slow!=null){
                str2 = str2 + slow.val;
                slow = slow.next;
            }
            if((str1.length() + str2.length())%2 != 0){
                str2 = str1.charAt(str1.length()-1) + str2;
            }
            StringBuffer other_half = new StringBuffer(str2);
            other_half.reverse();
            System.out.println(str1 + "," + other_half);
            return str1.equals(other_half.toString());
        }
    }
}
