//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node current = head;
        if( head == null) {
            head = new Node(x);
        }else{
            while(current.next !=null){
                current = current.next;
            }
            Node newData = new Node(x);
            current.next = newData;
        }
        return head;
    }
}
