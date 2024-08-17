//https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
{
    //Your code here
    if(head == null || head.next == null){
        return head;
    }
    Node current = head;
    Node prev = null;
    while( current != null){
        prev = current.prev;
        current.prev = current.next;
        current.next = prev;
        current = current.prev;
    }
    return prev.prev;
}
