//https://leetcode.com/problems/next-greater-element-ii/
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st =  new Stack<>();
        int nge_array[] = new int[nums.length];
        for(int i = 2 * (nums.length) - 1 ; i >= 0; i --){
            while(!st.isEmpty() && st.peek() <= nums[i%(nums.length)]) {
                st.pop();
            }
            if(i < nums.length){
                if (!st.isEmpty()) nge_array[i] = st.peek();
                else nge_array[i] = -1;
            }
            st.push(nums[i % nums.length]);
        }
        return nge_array;
    }
}
