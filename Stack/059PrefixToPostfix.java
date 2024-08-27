//https://www.geeksforgeeks.org/problems/prefix-to-postfix-conversion/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=prefix-to-postfix-conversion
class Solution {
    static String preToPost(String s) {
        int n = s.length(), i = n - 1;
        Stack<String> st = new Stack<>();
        
        while( i >= 0 ){
            char ch = s.charAt(i);
            if ( Character.isLetterOrDigit(ch)) st.push(Character.toString(ch));
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = t1 + t2 + ch ;
                st.push(con);
            }
            i--;
        }
        return st.pop();
    }
}
