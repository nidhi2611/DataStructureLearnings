//https://leetcode.com/problems/remove-outermost-parentheses/submissions/1375648163/
class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0,j = 0 ;
        String res = "";
        for( int i = 0;i < s.length(); i ++){
            if(s.charAt(i) == '('){
                counter++;
            }
            else if(s.charAt(i) == ')'){
                counter--;
            }
            if(counter == 0){
                res = res + s.substring(j+1,i);
                j = i + 1;
            }
        }
        return res;
    }
}
