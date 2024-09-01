//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1375188872/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int n = s.length();
        int maxlen = 0;
        while (right < n) {
            if (map.containsKey(s.charAt(right))) 
                left = Math.max(map.get(s.charAt(right)) + 1, left);

            map.put(s.charAt(right), right);
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
}
