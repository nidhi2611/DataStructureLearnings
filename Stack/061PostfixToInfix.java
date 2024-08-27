//https://www.geeksforgeeks.org/problems/postfix-to-infix-conversion/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=postfix-to-prefix-conversion
class Solution {
    static String postToInfix(String s) {
        int n = s.length(), i = 0;
        Stack<String> st = new Stack<>();
        
        while( i < n ){
            char ch = s.charAt(i);
            if ( Character.isLetterOrDigit(ch)) st.push(Character.toString(ch));
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "(" + t2 + ch + t1 + ")" ;
                // System.out.println(con);
                st.push(con);
            }
            i++;
        }
        return st.pop();
    }
}
