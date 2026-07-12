class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> a =new ArrayList<>();
        List<Integer> b =new ArrayList<>();
        int c[]=new int[nums.length];
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                a.add(nums[i]);
            }else if(nums[i]>pivot){
                b.add(nums[i]);
            }else{
                d++;
            }
        }
       for(int i=0;i<a.size();i++){
        c[i]=a.get(i);
       }
       for(int i=a.size();i<a.size()+d;i++){
        c[i]=pivot;
       }
       int j=0;
       for(int i=a.size()+d;i<a.size()+d+b.size();i++){
        c[i]=b.get(j++);
       }
       return c; 
    }
}