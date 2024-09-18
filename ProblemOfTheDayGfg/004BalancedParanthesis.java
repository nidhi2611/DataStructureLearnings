class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        boolean res = false;
        Stack<Character> st = new Stack();
        for( int i = 0 ; i < x.length() ; i++){
            char ch = x.charAt(i);
            if( ch == '[' || ch == '(' || ch == '{'){
                st.push(ch);
            }else if(ch == ']' || ch == ')' || ch == '}'){
                if(!st.isEmpty()){
                    if((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}')){
                        st.pop();
                    }else{
                        st.push(ch);
                    }
                }else{
                    st.push(ch);
                }
            }
        }
        if(st.size() > 0)
            res = false;
        else
            res = true;
        return res;
    }
}
