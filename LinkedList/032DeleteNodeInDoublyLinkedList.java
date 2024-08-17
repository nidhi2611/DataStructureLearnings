//https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
class Solution {
    public Node deleteNode(Node head, int x) {
        Node current = head;
        int index = 0;
        while(current.next!=null){
            ++index;
            if(index != 1 && index == x){
                current.data = current.next.data;
                current.next = current.next.next;
                break;
            }else if(index == 1 && x == 1){
                current.data = current.next.data;
                current.next = current.next.next;
                head = current;
                break;
            }
            current = current.next;
        }
        // System.out.println(index + "," +current.data);
        if((index+1) == x){
            current.prev.next = null;
        }
        return head;
    }
}
