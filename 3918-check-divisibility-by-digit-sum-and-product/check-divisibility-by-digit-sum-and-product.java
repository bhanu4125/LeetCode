class Solution {
    public boolean checkDivisibility(int n) {
        long sum=nsum(n);
        long mul=nmul(n);
        long add=sum+mul;
        if(n%add==0){
            return true;
        }else{
            return false;
        }
    }
    public long nsum(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
    public long nmul(int n){
        int s=1;
        while(n>0){
            int r=n%10;
            s*=r;
            n=n/10;
        }
        return s;
    }
}