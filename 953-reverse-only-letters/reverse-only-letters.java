class Solution {
    public String reverseOnlyLetters(String s) {
           //while(r<s.length()){
          // for(char c:p){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                sb.append(ch);
            }
        }
           String k= sb.reverse().toString();
           int r=0,l=0;
           char p[]=s.toCharArray();
           for(int i=0;i<p.length;i++){
            char c=p[i];
            if((c>='a' && c<='z') ||( c>='A' && c<='Z')){
                p[i]=k.charAt(l);
                l++;
             }
           }
       // System.out.print(c);
           String j=new String(p);
           return j;
        
    }
}