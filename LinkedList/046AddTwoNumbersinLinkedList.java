class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp2 = l2;
        String str1 = "",str2="";
        while(l1 != null){
            str1 = str1 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            str2 = str2 + l2.val;
            l2 = l2.next;
        }
        StringBuffer str_1 = new StringBuffer(str1);
        StringBuffer str_2 = new StringBuffer(str2);
        long sum = Long.parseLong(str_1.reverse().toString()) + Long.parseLong(str_2.reverse().toString());
        StringBuffer res = new StringBuffer(sum + "");
        String response = res.reverse().toString();
        System.out.print(response);
        int index = 0;
        ListNode newHead = new ListNode(-1);
        ListNode temp3 = newHead;
        while(index < response.length()){
            ListNode en = new ListNode(Character.getNumericValue(response.charAt(index)));
            newHead.next = en;
            index = index + 1;
            newHead = en;
        }
        return temp3.next;
    }
}
