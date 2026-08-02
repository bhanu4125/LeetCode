class Solution {
    public long maxPairStrength(int[] nums) {
        //Arrays.sort(nums);
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
        // int u=nums[nums.length-1]*nums[nums.length-2];
        // int k=gcd(nums[nums.length-1],nums[nums.length-2]);
        long u=nums[i];
        long h=nums[j];
        long k=gcd(nums[i],nums[j]);
        long y=(u*h)/(k*k);
        if(y>max){
            max=y;
        } 
            }
        }
        System.out.print(max);
                return max;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}