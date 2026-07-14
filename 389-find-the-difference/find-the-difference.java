class Solution {
    public char findTheDifference(String s, String t) {
        // HashSet<Character> a=new HashSet<>();
        // HashSet<Character> b=new HashSet<>();
        int b[] =new int[26];
        int a[] =new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            b[ch-'a']++;
        }
//return 'a';
for(int i=0;i<b.length;i++){
    if(b[i]>a[i]){
       char ch=(char)(i+'a');
        return ch;
    }
}
return 'a';
    }
}
