class Solution {
    public int digitFrequencyScore(int n) {
        int b[]=new int[10];
        while(n>0){
            int rem=n%10;
            b[rem]++;
            n=n/10;
        }
        int s=0;
        for(int i=0;i<b.length;i++){
            s+=i*b[i];
        }
        return s;
    }
}