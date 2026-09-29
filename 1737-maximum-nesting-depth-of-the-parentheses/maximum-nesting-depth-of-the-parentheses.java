class Solution {
    public int maxDepth(String s) {
        int c=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           // char c=s.charAt(i-1);
            if(ch=='('){
            c++;
            }else if(ch==')'){
                c--;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}