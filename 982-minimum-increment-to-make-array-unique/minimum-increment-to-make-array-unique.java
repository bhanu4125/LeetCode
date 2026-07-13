class Solution {
    public int minIncrementForUnique(int[] nums) {
        // HashSet<Integer> a= new HashSet<>();
        // int c=0,temp=0;
        // for(int i=0;i<nums.length;i++){
        //    // temp=nums[i];
        //     while(a.contains(nums[i])){
        //         c++;
        //         if(i<nums.length)
        //         nums[i]=nums[i]+1;
        //     }
        //     if(!a.contains(nums[i])){
        //         a.add(nums[i]);
        //     }
        // }
         Arrays.sort(nums);
         long moves = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int target = nums[i - 1] + 1;
                moves += target - nums[i];
                nums[i] = target;
            }
        }

        return (int) moves;
        // return c;
        //  HashSet<Integer> a = new HashSet<>();
        // int c = 0;
        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        //     while (a.contains(nums[i])) {
        //         nums[i]++;
        //         c++;
        //     }
        //     a.add(nums[i]);
        // }

        // return c;
    }
   // public int uni(int[] nums){

   // }
}