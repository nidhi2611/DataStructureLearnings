//https://leetcode.com/problems/largest-odd-number-in-string/submissions/1375695233/
class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i --){
            if(num.charAt(i)%2!=0) return num.substring(0,i+1);
        }
        return "";
    }
}
