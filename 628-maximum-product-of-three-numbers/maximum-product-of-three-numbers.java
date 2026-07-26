class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
        // int m1=Integer.MIN_VALUE;
        // int m2=Integer.MIN_VALUE;
        // int m3=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>m1){
        //         m1=nums[i];
        //     }else if(nums[i]>m2){
        //       if(nums[i]<m1)
        //         m2=nums[i];
        //     }else if(nums[i]>m3){
        //         if(nums[i]<m2)
        //         m3=nums[i];
        //     }
        // }
        //         System.out.println(m2);
        //         System.out.println(m3);
        //         System.out.println(m1);
        // return m1*m2*m3;
        //retunr 
    }
}