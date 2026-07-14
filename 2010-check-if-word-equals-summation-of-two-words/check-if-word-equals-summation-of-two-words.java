class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum=0,m=0,k=1,p=0;
        for(int i=firstWord.length()-1;i>=0;i--){
            char ch=firstWord.charAt(i);
            int b=ch-'a';
            sum+=b*k;
            k=k*10;
        }
        k=1;
        for(int i=secondWord.length()-1;i>=0;i--){
            char ch=secondWord.charAt(i);
            int b=ch-'a';
            m+=b*k;
            k=k*10;
        }
        k=1;
        for(int i=targetWord.length()-1;i>=0;i--){
            char ch=targetWord.charAt(i);
            int b=ch-'a';
            p+=b*k;
            k=k*10;
        }
        System.out.println(p);
        System.out.println(sum);
        System.out.println(m);
        if(sum+m==p)
        return true;
        else{
            return false;
        }
    }
}