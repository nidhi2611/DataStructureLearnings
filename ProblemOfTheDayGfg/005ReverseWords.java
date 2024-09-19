class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String word = "";
        int p = 0;
        String reverse_word = "";
        Stack<String> st = new Stack<>();
        String sentence = str.trim() + ".";
        for( int i = 0 ; i < sentence.length() ; i++){
            if( sentence.charAt(i) == '.'){
                word = sentence.substring(p,i);
                p = i + 1;
                st.push(word);
            }
        }
        while(!st.isEmpty()){
            reverse_word = reverse_word + st.pop() + ".";
        }
        return reverse_word.substring(0,reverse_word.length()-1);
    }
}
