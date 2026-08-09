class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n=prices.length-1;
        int p=discounts.length-1;
        double sum=0;
        while(p>=0&&n>=0){
            sum+=prices[n] * (100.0-discounts[p])/100.0;
           // System.out.println(discounts[p]);
            //System.out.println(sum);
            n--;
            p--;
            
        }
        while(n>=0){
            sum+=prices[n];
            n--;
        }
        return sum;
    }
}