class Solution {
    public boolean isPalindromic(String s) {
        // if(s.length()==1){
        //     return false;
        // }
        StringBuffer sb=new StringBuffer();
        StringBuffer k=new StringBuffer();
        for(char c:s.toCharArray()){
            sb.append(String.format("%8s",Integer.toBinaryString(c)).replace(' ','0'));
        }
        k.append(sb);
        sb.reverse();
        String t=sb.toString();
        String p=k.toString();
        if(t.equals(p)){
            return true;
        }else{
            return false;
        }
    }
}