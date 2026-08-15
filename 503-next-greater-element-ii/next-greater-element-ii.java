class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int b[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            while(!st.isEmpty()&&st.peek()<=curr){
                st.pop();
            }
            if(st.isEmpty()){
                b[i%n]=-1;
            }else{
                b[i%n]=st.peek();
            }
            st.push(nums[i%n]);
        }
        return b;
    }
}