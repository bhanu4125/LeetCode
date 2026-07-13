class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> a=new HashMap<>();
        HashMap<Character,Integer> b=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            a.put(ch,a.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            if(a.containsKey(ch)){
            b.put(ch,b.getOrDefault(ch,0)+1);
            }else{
                return false;
            }
        }
     //   for(int i=0)
        int [] c=new int[a.size()];
        int [] d=new int[b.size()];
        int i=0;
        for(int k: a.values()){
            c[i++]=k;
        }
        i=0;
        for(int k:b.values()){
            d[i++]=k;
        }
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            return true;
        }else{
            return false;
        }
    }
}