//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null && headB.next == null && headA == headB){
            return headA;
        }
        ListNode temp1 = headA;
        int cnt1=0,cnt2=0;
        while(temp1.next != null){
            cnt1 += 1;
            temp1 = temp1.next;
        }
        ListNode temp2 = headB;
        while(temp2.next != null){
            cnt2 += 1;
            temp2 = temp2.next;
        }
        ListNode larger = null;
        ListNode smaller = null;
        
        if( cnt1 >= cnt2){
            larger = headA;
            smaller = headB;
        }else{
            larger = headB;
            smaller = headA;
        }
        int diff = Math.abs(cnt1-cnt2);
        System.out.println(diff);
        while(diff != 0 && larger != null){
            larger = larger.next;
            diff--;
        }
        while( larger.next != null && smaller.next != null){
            if(larger == smaller){
                return larger;
            }
            larger = larger.next;
            smaller = smaller.next;
        }
        if(larger == smaller){
            return larger;
        }
        return null;
    }
}
