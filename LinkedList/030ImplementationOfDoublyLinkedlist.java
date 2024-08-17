//https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1
class Solution {
    Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]);
        head.prev = null;
        Node current = head;
        for(int i = 1;i<arr.length;i++){
            Node newData = new Node(arr[i]);
            current.next = newData;
            newData.prev = current;
            current = newData;
        }
        return head;
    }
}
