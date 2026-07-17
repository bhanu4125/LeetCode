class Solution {
    public String countAndSay(int n) {
     //   int i=1;
        if(n==1){
            return "1";
        }
        String p=countAndSay(n-1);
        int i=0;
       StringBuilder sb=new StringBuilder();
       while(i<p.length()){
        int c=1;
        while(i+1<p.length()&&p.charAt(i)==p.charAt(i+1)){
        c++;
        i++;
       }
       sb.append(c).append(p.charAt(i));
       i++;
       }
       return sb.toString();

            }
        }