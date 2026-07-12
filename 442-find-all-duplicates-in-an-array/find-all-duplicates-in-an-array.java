class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                n.add(nums[i]);
            }
            a.add(nums[i]);
        }
       return n; 
    }
}