//https://leetcode.com/problems/sort-list/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head == null || head.next == null){
            return head;
        }
        int zero_pointer = 0;
        int one_pointer = 0;
        int two_pointer = 0;
        int index = 0;
        Node temp = head;
        while(temp.next!=null){
            index = index + 1;
            if(temp.data == 0){
                zero_pointer = zero_pointer + 1;
            }
            if(temp.data == 1){
                one_pointer = one_pointer + 1;
            }
            if(temp.data == 2){
                two_pointer = two_pointer + 1;
            }
            temp = temp.next;
        }
        if(temp.data == 0){
            zero_pointer = zero_pointer + 1;
        }
        if(temp.data == 1){
            one_pointer = one_pointer + 1;
        }
        if(temp.data == 2){
            two_pointer = two_pointer + 1;
        }
        Node new_head = new Node(-1);
        Node temp2 = new_head;
        while(zero_pointer != 0){
            Node newData = new Node(0);
            temp2.next = newData;
            zero_pointer = zero_pointer - 1;
            temp2 = temp2.next;
        }
        while(one_pointer != 0){
            Node newData = new Node(1);
            temp2.next = newData;
            one_pointer = one_pointer - 1;
            temp2 = temp2.next;
        }
        while(two_pointer != 0){
            Node newData = new Node(2);
            temp2.next = newData;
            two_pointer = two_pointer - 1;
            temp2 = temp2.next;
        }
        return new_head.next;
    }
}
