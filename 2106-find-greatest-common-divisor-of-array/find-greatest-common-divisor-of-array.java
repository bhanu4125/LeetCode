class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int k=gcd(nums[0],nums[nums.length-1]);
        return k;
    }
    public int gcd(int n,int p){
            if(p==0){
            return n;
            }
            else{
                return gcd(p,n%p);
            }
    }
}