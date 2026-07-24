class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        for(int i=1;i<nums.length;i++){
          //  c=nums[i-1]^nums[i];
          if(nums[i]==nums[i-1]){
            c++;
          }else{
            if(c==1){
                return nums[i-1];
            }else{
                c=1;
            }
          }

        }
        return nums[nums.length - 1];
    }
}