//https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=infix-to-postfix
class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < exp.length(); i ++){
            if( (exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z') || (exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z') || (exp.charAt(i)>='0' && exp.charAt(i)<='9')){
                res = res + exp.charAt(i);
            }
            else if(exp.charAt(i) == '('){
                st.push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')'){
                while (!st.isEmpty() && st.peek() != '(') {
                    res += st.peek();
                    st.pop();
                }
                if(!st.empty()) st.pop();
            }
            else{
                while (!st.isEmpty() && priority(st.peek()) >= priority(exp.charAt(i))) {
                    res += st.peek();
                    st.pop();
                }
                st.push(exp.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            res += st.peek();
            st.pop();
        }
        return res;
    }
    public static int priority(Character s){
        if(s == '^'){
            return 3;
        }else if( s == '*' || s =='/'){
            return 2;
        }else if( s == '+' || s =='-'){
            return 1;
        }else{
            return -1;
        }
    }
}
