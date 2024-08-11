//https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else{
            int longest = 1;
            Set<Integer> set = new HashSet<>();
            for(int k = 0;k <nums.length;k++){
                set.add(nums[k]);
            }
            for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int e = i;
                while (set.contains(e + 1)) {
                    e = e + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
            }
            return longest;
        }
    }
}
