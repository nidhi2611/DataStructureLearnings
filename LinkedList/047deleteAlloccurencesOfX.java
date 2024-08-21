//https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        Node back = null;
        Node front = null;
        while(temp != null){
            if(temp.prev == null && temp.data == x){
                temp = temp.next;//5
                temp.prev = null;
                head = temp;
            }else if(temp.next == null && temp.data == x){
                temp.prev.next = null;
                temp = null;
            }
            else if(temp.data == x){
                back = temp.prev;
                front = temp.next;
                back.next = front;
                front.prev = back;
                temp = front;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
