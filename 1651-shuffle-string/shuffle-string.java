class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=s.toCharArray();
        char b[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            b[indices[i]]=a[i];
        }
        String k=new String(b);
        return k;
    }
}