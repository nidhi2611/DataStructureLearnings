//https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String res = "",word="";
        s = s.trim() + " ";
        int p = 0;
        for(int i = 0; i < s.length() ;i++){
            if(s.charAt(i) == ' '){
                word = s.substring(p,i);
                p = i + 1;
                st.push(word);
            }
        }
        int stack_size = st.size();
        for(int j =0; j< stack_size;j++){
            String words = st.pop();
            // System.out.println("$" + words + "$");
            if(words.compareTo("") != 0)
            res = res + words + " ";
        }
        return res.trim();
    }
}
