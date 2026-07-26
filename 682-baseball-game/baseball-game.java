class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];

            if (ch.equals("C")) {
                st.pop();
            } 
            else if (ch.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (ch.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                int sum = first + second;
                st.push(first); 
                st.push(sum);
            } 
            else {
                st.push(Integer.parseInt(ch));
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
//         int c=0;
//         Stack<Integer> st= new Stack<>();
//         Stack<Integer> b= new Stack<>();
//         for(int i=0;i<operations.length;i++){
//            // char ch=operations.charAt(i);
//            String ch = operations[i];
//             if(Character.isdigit(ch)){
//                 st.push(ch);
//                 b.push(ch);
//             }
//             else if(ch.equals("C")){
//                 st.pop();
//             }
//             else if(ch.equals("D")){
//                 int y=0;
//                 while(y<=2){
//                     c*=b.peek();
//                     b.pop();
//                     st.pop();
//                     y++;
//                 }
//                 st.push(c);
//                 b.push(c);
//                 c=0;
//             }else if(ch.equals("+")){
//                 int y=0;
//                 while(y<=2){
//                     c+=b.peek();
//                     b.pop();
//                     st.pop();
//                     y++;
//                 }
//                 st.push(c);
//                 b.push(c);
//             }

//         }
//         int k=0;
//         while(st.peek(isEmpty)){
//             k+=st.peek();
//             st.pop();
//         }
//         return k;
//     }
// }