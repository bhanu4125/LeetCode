class Solution {
    public int smallestNumber(int n, int t) {
        int k=0,sum=0;
        while(true){
            int y=sum1(n);
            if(y%t==0){
                return n;
            }
            n++;
        }
       // return 0;
    }
    public int sum1(int a){
        int p=a,rem=0,s=1;
        while(p>0){
            rem=p%10;
            s*=rem;
            p=p/10;
        }
        return s;
    }
}