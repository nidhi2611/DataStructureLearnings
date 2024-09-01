//https://leetcode.com/problems/rotate-string/
class Solution {
    public boolean rotateString(String s, String goal) {
        boolean res = false;
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equalsIgnoreCase(goal)){
            return true;
        }
        int rotation = 1;
        while(rotation < s.length()){
            String new_word = s.substring(rotation,s.length()) + s.substring(0,rotation);
            // System.out.println(new_word);
            if(new_word.equalsIgnoreCase(goal)){
                res =  true;
                break;
            }
            rotation = rotation + 1;
        }
        return res;
    }
}
