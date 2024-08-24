//https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-array
class MyStack {
    private int[] arr;
    private int top;
    int x = 0;
    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top] = x;
    }

    public int pop() {
        // Your Code
        if(top == -1)
            return -1;
        else
            x = arr[top];
            top--;
            return x;
            
    }
}
