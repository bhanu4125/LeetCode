class Solution {
    public int minimumPushes(String word) {
        int k=word.length();
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += (i / 8) + 1;
        }
        return ans;
        //System.out.print(k);
        // int p=k;
        // int o=0,sum=0;
        // if(k<=8){
        //     return k;
        // }
        // while(k>8){
        //     o=k-8;
        //    // if(k>=0)
        //      sum+=o;
        //      k=k-o;

        // }
        // return p+sum;
        
    }
}