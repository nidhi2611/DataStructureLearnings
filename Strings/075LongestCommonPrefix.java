//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0], word = "";
        for ( int i = 1; i < strs.length; i ++){
            word = strs[i];
            int index = 0;
            String res = "";
            while(index < word.length() && index < prefix.length()){
                if(prefix.charAt(index) == word.charAt(index)){
                    res = res + prefix.charAt(index);
                    index  = index + 1;
                }else{
                    break;
                }
            }
            prefix = res;
        }
        return prefix;
    }
}
