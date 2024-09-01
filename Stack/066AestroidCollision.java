// https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int sign = 0;
        for( int i = 0;i < asteroids.length;i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
                sign = 1;
            }else{
                sign = 0;
                if(st.isEmpty() == true || st.peek() < 0){
                    st.push(asteroids[i]);
                    continue;
                }
                if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    continue;
                }
                else if(st.peek() > Math.abs(asteroids[i])){
                    continue;
                }
                else if(st.peek() < Math.abs(asteroids[i])){
                    int sign_peek = 0;
                    if(st.peek() > 0){
                        sign_peek = 1;
                    }
                    int eq = 0;
                    while(!st.isEmpty() && st.peek() <= Math.abs(asteroids[i]) && sign_peek != sign){
                        st.pop();
                        if(st.peek() > 0){
                            sign_peek = 1;
                        }else{
                            sign_peek = 0;
                        }
                        
                        if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                            eq = 1;
                        }
                    }
                    if( sign_peek == sign && eq!=1){
                        st.push(asteroids[i]);
                    }
                }
            }
        }
        int res[] = new int[st.size()];
        int n = st.size();
        for(int k = 0; k < n; k ++){
            res[n-k-1] = st.pop(); 
        }
        return res;
    }
}
