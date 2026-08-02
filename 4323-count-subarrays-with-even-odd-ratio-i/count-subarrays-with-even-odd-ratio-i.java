class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0,o=0,e=0;
        for(int i=0;i<nums.length;i++){
            e=0;
            o=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    e++;
                }else{
                    o++;
                }
            if(o>0){
                if((long)e*b<=(long)a*o){
                    c++;
                }
                }
            // System.out.println(e);
            // System.out.println(o);
            }
        }
    return c;
}
}