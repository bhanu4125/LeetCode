class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s=0,p=0;
        for(int i=1;i<=n+n;i++){
            if(i%2==0){
                s+=i;
            }else{
                p+=i;
            }
        }
        int l=gcd(s,p);
        return l;
    }

    public int gcd(int s,int p){
    if (p == 0) return s;
    return gcd(p, s % p);
}
}