//https://www.geeksforgeeks.org/problems/number-of-nges-to-the-right/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-nges-to-the-right
class Solution {
    public static int[] count_NGEs(int N, int nums[], int queries, int indices[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();
        for(int i = nums.length -1 ; i >= 0;i--){
            int count = 0;
            while(st1.isEmpty() == false){
                if(st1.peek() > nums[i]){
                    count = count + 1;
                    int x = st1.pop();
                    st2.push(x);
                }
                else{
                    st2.push(st1.pop());
                }
            }
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
            st1.push(nums[i]); //6 10 8
            map.put(nums[i],count); // (6,0), (10,0), (8,1)
        }
        int res[] = new int[queries];
        for(int k = 0;k < queries;k++){
            res[k] = map.get(nums[indices[k]]);
        }
        return res;
    }
}
