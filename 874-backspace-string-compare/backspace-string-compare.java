class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a=new Stack<>();
        Stack<Character> b=new Stack<>();
        int y=s.length();
        int k=t.length();
        int i=0;
        while(i<y){
            char ch=s.charAt(i);
            if(ch!='#'){
                a.push(ch);
            }else if(!a.isEmpty()){
                a.pop();
            }
            i++;
        }
        i=0;
        while(i<k){
            char ch=t.charAt(i);
            if(ch!='#'){
                b.push(ch);
            }else if(!b.isEmpty()){
                b.pop();
            }
            i++;
        }
        if(a.size()!=b.size()){
            return false;
        }
        while(!a.isEmpty()&&!b.isEmpty()){
            if(a.peek()!=b.peek()){
                return false;
            }
            a.pop();
            b.pop();
        }
        return true;
    }
}