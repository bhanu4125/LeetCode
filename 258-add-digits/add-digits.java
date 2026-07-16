class Solution {
    public int addDigits(int num) {
           int k=fun(num);
       // System.out.println(k);
       return k;
    }
    public static int fun(int num){
        int rem=0,sum=0;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        if(sum>9){
            return fun(sum);
        }else{
            return sum;
        }
    }
}