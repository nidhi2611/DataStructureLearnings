class Solution {
    void rearrange(ArrayList<Integer> arr) {
        Object[] arr_elements = arr.toArray();
        Queue<Integer> positive = new LinkedList<>();
        Queue<Integer> negative = new LinkedList<>();
        for( int i = 0; i < arr_elements.length; i ++){
            if( (int)arr_elements[i] >= 0){
                positive.add((int)arr_elements[i]);
            }
            else{
                negative.add((int)arr_elements[i]);
            }
        }
        
        int len = 0;
        if( positive.size()  < negative.size ())
            len = positive.size();
        else
            len = negative.size();

        for( int i = 0; i < 2*len; i ++){
            if( i % 2 == 0){
                if( positive.isEmpty() == false){
                    arr.set(i, positive.poll());
                }else{
                    break;
                }
            }else{
                if( negative.isEmpty() == false){
                    arr.set(i,negative.poll());
                }else{
                    break;
                }
            }
        }
        
        int k = 2*len;
        while( !positive.isEmpty() ){
            arr.set(k++, positive.poll());
        }
        while( !negative.isEmpty() ){
            arr.set(k++, negative.poll());
        }
    }
}
