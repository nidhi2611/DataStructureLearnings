class Solution{
    static int maxLength(String S){
        int open = 0;
        int closed = 0;
        int maxLen1 = 0;
        int maxLen2 = 0;
        for( int i = 0 ; i < S.length();i ++){
            if(S.charAt(i) == '('){
                open ++;
            }else{
                closed++;
            }
            if(closed > open){
                open  = 0 ;
                closed = 0;
            }
            if( closed == open){
                maxLen1 = Math.max(maxLen1, 2* open);
            }
        }
        open = 0;
        closed = 0;
        for( int i = S.length()-1 ; i > 0 ;i --){
            if(S.charAt(i) == '('){
                open ++;
            }else{
                closed++;
            }
            if(closed < open){
                open  = 0 ;
                closed = 0;
            }
            if( closed == open){
                maxLen2 = Math.max(maxLen2, 2* open);
            }
        }
        return Math.max(maxLen1,maxLen2);
        
    }
}
