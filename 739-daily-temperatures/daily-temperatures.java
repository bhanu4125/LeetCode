class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int a[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty()&& temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty()){
                a[i]=0;
            }else{
                a[i]=st.peek()-i;
            }
            st.push(i);
        }
        return a;
    }
}