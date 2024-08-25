//https://leetcode.com/problems/min-stack/
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        int pop = st.pop();
        if (pop == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        if (st.isEmpty()) return -1; // or throw an exception
        return st.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) return -1; // or throw an exception
        return minStack.peek();
    }
}
