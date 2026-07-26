class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch==')'&&st.peek()=='('){
                st.pop();
            }else if(ch=='}'&&st.peek()=='{'){
                st.pop();
            }else if(ch==']'&&st.peek()=='['){
                st.pop();
            }else{
                return false;
            }
        }
        if(st.size()==0)
        return true;
        else
        return false;
    }
}