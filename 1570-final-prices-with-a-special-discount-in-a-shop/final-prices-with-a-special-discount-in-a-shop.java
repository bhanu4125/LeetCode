class Solution {
    public int[] finalPrices(int[] prices) {
        int b[]=new int[prices.length];
      //  Arrays.fill(b,prices);
      int o=0;
      for(int k:prices){
        b[o++]=k;
      }
      int j=0;
        for(int i=0;i<prices.length;i++){
            j=i+1;
            for(j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    b[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return b;
    }
}