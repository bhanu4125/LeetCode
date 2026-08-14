class Solution {
    public int maximumLengthSubstring(String s) {
        int p=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String k=s.substring(i,j);
                int u=fun(k);
                p=Math.max(u,p);
            }
        }
        return p;
    }
    public int fun(String k){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<k.length();i++){
            char ch=k.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>2){
                return i-1;
            }
        }
        return k.length();
    }
}