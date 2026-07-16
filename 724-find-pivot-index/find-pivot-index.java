class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0,t=0,t1=0;
        for(int i=0;i<nums.length;i++){
            l=0;
            r=i+1;
            t=0;
            t1=0;
            while(l<i){
                t+=nums[l++];
            }
            while(r<nums.length){
                t1+=nums[r++];
            }
          //  System.out.println(t);
          //  System.out.println(t1);
            if(t==t1){
                return i;
            }
        }
        return -1;
        
    }
}