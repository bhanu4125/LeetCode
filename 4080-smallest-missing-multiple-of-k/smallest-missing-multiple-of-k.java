class Solution {
    public int missingMultiple(int[] nums, int k) {
        //String a="";
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        //System.out.println(a);
        for(int i=1;i<=100;i++){
            int b=i*k;
            if(!a.contains(b)){
                return b;
            }
        }
        return 101;
    }
}