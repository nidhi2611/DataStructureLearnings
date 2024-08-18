//https://www.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-length-of-loop
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        int index = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;  
            if (slow == fast) {
                index = 1;
                fast = fast.next;
                while(slow!=fast){
                    index++;
                    fast = fast.next;
                }
                return index;
            }
        }
        return index;
    }
}
