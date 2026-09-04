class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int u=-1;
        for(int i=0;i<nums.length;i++){
            int h=max(nums,i);
            int l=min(nums,i);
            int g=h-l;
           //System.out.println(g);
           //System.out.println(k);
            if(g<=k){
                return i;
                }
        }
        return u;
        
    }
    public int max(int []nums,int i){
        int s=0;
        for(int j=0;j<=i;j++){
            s=Math.max(s,nums[j]);
        }
        return s;
    }
    public int min(int []nums,int i){
        int p=Integer.MAX_VALUE;
        for(int j=i;j<nums.length;j++){
            p=Math.min(p,nums[j]);
        }
        return p;
    }
}