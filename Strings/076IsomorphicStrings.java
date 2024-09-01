class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        boolean ans = true;
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!map.containsKey(s.charAt(i)+"")){
                map.put(s.charAt(i)+ "" , t.charAt(i)+"");
            }else{
                String res = map.get(s.charAt(i)+"");
                String t_word = t.charAt(i)+"";
                if(res.equals(t_word)){
                    continue;
                }else{
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
