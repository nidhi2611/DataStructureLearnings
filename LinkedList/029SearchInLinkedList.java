//https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        boolean res = false;
        Node current = head;
        while(current.next != null){
            if(current.data == key){
                res = true;
                break;
            }
            current= current.next;
        }
        if(current.data == key){
            res = true;
        }
        return res;
    }
}
