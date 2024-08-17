//https://www.geeksforgeeks.org/problems/introduction-to-linked-list/

    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1;i < arr.length;i++){
            Node n = new Node(arr[i]);
            current.next = n;
            current = n;
        }
        return head;
    }
}
