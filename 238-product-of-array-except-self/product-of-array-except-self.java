class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int l=0,r=0,t=1,t1=1;
        for(int i=0;i<nums.length;i++){
           t*=nums[i];
        }
        r=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
           int k=t/nums[i];
           ans[i]=k;
            }
           else{
                for(int j=0;j<nums.length;j++){
                    if(j!=i){
                  r*=nums[j];
        }
            }

        ans[i]=r;
        r=1;
            }
        }
    return ans;
    }
}