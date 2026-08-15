class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int b[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            b[i]=c;
        }
        return b;
    }
}