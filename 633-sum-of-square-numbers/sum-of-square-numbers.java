class Solution {
    public boolean judgeSquareSum(int c) {
        long n=(long)Math.sqrt(c);
        long r=0;
       // System.out.println(n);
       while(r<=n){
                long sum=r*r+n*n;
                if(sum==c)
                    return true;
                else if(sum<c){
                    r++;
                }else if(sum>c){
                    n--;
                }
            }
        return false;  
    }
}