class Solution {
    public int maxProfit(int[] prices) {
          if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
        // int n=prices[0];
        // int max=Integer.MIN_VALUE,min=0,sum=0,prev=Integer.MIN_VALUE;
        // for(int i=1;i<prices.length;i++){
        //     if(prices[i-1]<prices[i]){
        //         min=i-1;
        //     }else{
        //         min=i;
        //     }
        //     if(prev<min){
        //         prev =min;
        //     for(int j=min;j<prices.length;j++){
        //         max=Math.max(max,prices[j]-prices[min]);
        //     }
        // }
        // }
        // if(max<=0){
        //     return 0;
        // }else{
        //     return max;
        // }
    }
}