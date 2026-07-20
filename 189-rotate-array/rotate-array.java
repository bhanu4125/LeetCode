class Solution {
    public void rotate(int[] nums, int k) {
        int j=k;
        int l=0;
        int p[]=new int[nums.length];
        int b=nums.length;
         k = k % b;
        // while(j>0){
        //     p[j-1]=nums[b--];
        //     j--;
        // }
        for(int i=b-k;i<b;i++){
            p[l++]=nums[i];
        }
         for (int i = 0; i < b- k; i++) {
            p[l++] = nums[i];
        }

        for (int i = 0; i < b; i++) {
            nums[i] = p[i];
        }
    }
}