class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(a.get(a.size()-1)>=b.get(b.size()-1)){
           // if (a.get(a.size() - 1) >= b.get(b.size() - 1)) {
                a.add(nums[i]);
            }else{
                b.add(nums[i]);
            }
        }
        int c[]=new int[a.size()+b.size()];
        int i=0;
        for(int k:a){
            c[i++]=k;
        }
        for(int j:b){
            c[i++]=j;
        }

        return c;
    }
}