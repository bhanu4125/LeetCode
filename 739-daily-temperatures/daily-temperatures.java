class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int a[]=new int[temperatures.length];
        //Arrays.fill(a,0);
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty()&&temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                a[i]=st.peek()-i;
            }
            st.push(i);
        }
        return a;
    }
}