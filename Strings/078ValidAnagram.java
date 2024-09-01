//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = false;
        if(s.length() != t.length()){
            return false;
        }
        if(s.equalsIgnoreCase(t)){
            return true;
        }
        HashMap<Character,Integer> s_count = new HashMap<>();
        HashMap<Character,Integer> t_count = new HashMap<>();
        for(int i = 0; i < s.length(); i ++){
            if(s_count.containsKey(s.charAt(i))){
                s_count.put(s.charAt(i),s_count.get(s.charAt(i))+1);
            }else{
                s_count.put(s.charAt(i),1);
            }
            if(t_count.containsKey(t.charAt(i))){
                t_count.put(t.charAt(i),t_count.get(t.charAt(i))+1);
            }else{
                t_count.put(t.charAt(i),1);
            }
        }
        for(int j = 0 ; j < s.length(); j++){
            System.out.println(s.charAt(j)+","+s_count.get(s.charAt(j)));
            System.out.println(s.charAt(j)+","+t_count.get(s.charAt(j)));
            if(s_count.get(s.charAt(j)) == t_count.get(s.charAt(j))){
                System.out.println("true from in");
                res = true;
            }else{
                res = false;
                break;
            }
        }
        return res;
    }
}
