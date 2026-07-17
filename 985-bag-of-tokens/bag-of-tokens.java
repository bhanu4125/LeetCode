class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int s=0;
        Arrays.sort(tokens);
        int p[]=new int[tokens.length];
        int c=0;
        int n=tokens.length-1;
        int max=0;
        while(c<=n){
            if(power>=tokens[c]){
                power-=tokens[c];
                c++;
                s++;
                max=Math.max(max,s);
            }else if(s>0){
                power=power+tokens[n];
                s--;
                n--;
            }else{
                break;
            }
        }
        return max;
        // for(int i=0;i<tokens.length;i++){
        //     if(c%2==0){
        //         p[i]=tokens[n--];
        //     }else{
        //         p[i]=tokens[i];
        //     }
        // }
        // int l=tokens.length;
        // for(int i=0;i<l;i++){
        //     if(power>=p[i]){
        //         s++;
        //     }
        //     else if(s>0){
        //         power=power+p[i];
        //         s--;
        //     }
        // }
    }
}