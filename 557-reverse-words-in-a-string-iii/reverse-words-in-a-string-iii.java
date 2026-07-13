class Solution {
    public String reverseWords(String s) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        String k[]=s.split(" ");
        for(int i=0;i<k.length;i++){
            a.append(k[i]);
            a.reverse();
            b.append(a).append(" ");
           // a.delete();
           a.setLength(0);
        }
       // int index=b.length()-1;
        b.deleteCharAt(b.length()-1);
        //b.deletecharAt(b.length()-1);
        return b.toString();
        
    }
}