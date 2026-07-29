class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // Stack<Integer> st=new Stack();
        int k[]=new int[nums1.length];
        Arrays.fill(k,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int p=j+1;p<nums2.length;p++){
                        if(nums2[p]>nums1[i]){
                            k[i]=nums2[p];
                            break;
                        }
                    }
                }
            }
        }
        return k;
        // for(int i=0;i<nums1.length;i++){
        //     while(!st.isEmpty()&&st.peek()<nums1[i])
        //     {
        //         st.pop();
            }
        }