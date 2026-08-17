class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int b[]=new int[heights.length];
        int a[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                b[i]=heights.length;
            }else{
                b[i]=st.peek();
            }
            st.push(i);
    }
    st.clear();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                a[i]=-1;
            }else{
                a[i]=st.peek();
            }
          
            st.push(i);
    }
    int m=0;
    for(int i=0;i<heights.length;i++){
        int w=b[i]-a[i]-1;
        m=Math.max(m,heights[i]*w);
    }
    return m;
    }
}