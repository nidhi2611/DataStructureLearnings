//https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-linked-list
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        if(top == null){
            StackNode data = new StackNode(a);
            top = data;
        }
        else{
            StackNode newData = new StackNode(a);
            newData.next = top;
            top = newData;
        }
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if( top == null){
            return -1;
        }
        int ans = top.data;
        top = top.next;
        return ans;
        // Add your code here
    }
}
