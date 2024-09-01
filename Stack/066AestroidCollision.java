// https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for( int i = 0;i < asteroids.length;i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                if(st.isEmpty() == true || st.peek() < 0){
                    st.push(asteroids[i]);
                    continue;
                }
                if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    break;
                }
                else if(st.peek() > Math.abs(asteroids[i])){
                    break;
                }
                else if(st.peek() < Math.abs(asteroids[i])){
                    while(!st.isEmpty() && st.peek() < Math.abs(asteroids[i]) && ( (st.peek() > 0 && asteroids[i] < 0) || (st.peek() < 0 && asteroids[i] > 0) )){
                        st.pop();
                    }
                    if((st.peek() < 0 && asteroids[i] < 0) || st.peek() > 0 && asteroids[i] > 0{
                        st.push(asteroids[i]);
                    }
                }
            }
        }
        // System.out.println(st.size());
        int res[] = new int[st.size()];
        int n = st.size();
        for(int k = 0; k < n; k ++){
            res[n-k-1] = st.pop(); 
        }
        return res;
    }
}
