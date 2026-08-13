class Solution {
    public int strStr(String haystack, String needle) {
        // if(!haystack.contains(needle)){
        //     return -1;
        // }
        char a[]=haystack.toCharArray();
        char b[]=needle.toCharArray();
        int c=0,i=0,j=0,k=0;
        // System.out.println(a.length);
        while(i<a.length){
             k=i;
            if(a[i]==b[j]){
                while(j<b.length&&i<a.length&&a[i]==b[j]){
                    c++;
                    i++;
                    j++;
                    if(c==b.length){
                        return k;
                    }
                }
            }
            i=k+1;
            j=0;
            c=0;
        }
        return -1;
    }
}