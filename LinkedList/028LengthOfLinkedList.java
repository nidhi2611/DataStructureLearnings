
//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int length = 0;
        if( head.next == null){
            length = 1;
        }else{
            while(head.next != null){
                length +=1;
                head = head.next;
            }
            length = length +1;//for head
        }
        return length;
    }
}
