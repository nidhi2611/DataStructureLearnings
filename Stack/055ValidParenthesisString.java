//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        boolean res = false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
                System.out.print("pushed" + s.charAt(i));
            }else if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && st.size() > 0){
                char top = st.pop();
                if(top == '(' && s.charAt(i) == ')'){
                    continue;
                }
                else if(top == '{' && s.charAt(i) == '}'){
                    continue;
                }
                else if(top == '[' && s.charAt(i) == ']'){
                    continue;
                }
                else{
                    res = true;
                    break;
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        if(!st.isEmpty()){
            res = true;
        }
        return !res;
    }
}
