class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{
                if(st.peek()==ch){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        String k="";
        while(!st.isEmpty()){
            k+=st.peek();
            st.pop();
        }
        String rev = new StringBuilder(k).reverse().toString();
        return rev;
    }
}