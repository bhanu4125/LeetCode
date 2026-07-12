class Solution {
    public int[] rearrangeArray(int[] nums) {
          int[] ans = new int[nums.length];
        int p = 0, n = 1;

        for (int x : nums) {
            if (x > 0) {
                ans[p] = x;
                p += 2;
            } else {
                ans[n] = x;
                n += 2;
            }
        }

        return ans;
        // int r=0,l=0;
        //     int temp=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0){
        //         if(nums[i]>0){
        //         nums[r]=nums[i];
        //         r++;
        //         l++;
        //         }else if(temp>0){
        //             nums[r]=nums[i];
        //         r++;
        //         l++;
        //         }
        //     }else if(nums[i]<0 && i%2!=0){
        //         nums[l]=nums[i];
        //         l++;
        //         r++;
        //     }else{
        //         temp=nums[i];
        //     }
        // }
        // while(r<nums.length-1){
        //     if(r%2==0){
        //         if(nums[r]>0){
        //             continue;
        //         }else{
        //             if(nums[r+1]>0){
        //                 int temp=nums[r];
        //                 nums[r]=nums[r+1];
        //                 nums[r+1]=temp;
        //             }
        //         }
        //     }
        //     r++;
        // }
       // return nums;
        
    }
}