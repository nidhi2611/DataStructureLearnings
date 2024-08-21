class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        Node temp = head;
        Node front = null;
        Node back = null;
        int prev_data = 0;
        while( temp != null){
            if(temp.prev == null){
                prev_data = temp.data;
                temp = temp.next;
            }else{
                if(temp.next == null && temp.data == prev_data){
                    temp.prev.next = null;
                    temp = null;
                }
                else if(temp.data == prev_data){
                    front = temp.next;
                    back = temp.prev;
                    back.next = front;
                    front.prev = back;
                    temp = front;
                }
                else{
                    prev_data = temp.data;
                    temp= temp.next;
                }
            }
        }
        return head;
    }
}
