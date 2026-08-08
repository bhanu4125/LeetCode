// class Solution {
//     public long maxPairStrength(int[] nums) {
//         //Arrays.sort(nums);
//         long max=Long.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
                
//         // int u=nums[nums.length-1]*nums[nums.length-2];
//         // int k=gcd(nums[nums.length-1],nums[nums.length-2]);
//         long u=nums[i];
//         long h=nums[j];
//         long k=gcd(nums[i],nums[j]);
//         long y=(u*h)/(k*k);
//         if(y>max){
//             max=y;
//         } 
//             }
//         }
//         System.out.print(max);
//                 return max;
//     }
//     public int gcd(int a,int b){
//         if(b==0){
//             return a;
//         }
//         else{
//             return gcd(b,a%b);
//         }
//     }
// }
class Solution {
    public long maxPairStrength(int[] nums) {
        Arrays.sort(nums);
        // int div=gcd(nums[nums.length-2],nums[nums.length-1]);
        // div*=div;
        int j=nums.length-1;
        int i=j-1;
        long max=0;
        while(i>=0){
            long mul=(long)(nums[j])*(long)nums[i];
            int div=gcd(nums[i],nums[j]);
            long let=mul/(long)(div*div);
            if(max<let){
                max=let;
            }
            i--;
            if(i==-1){
                j-=1;
                i=j-1;
            }
        }
        return max;
        // return (long)((long)nums[nums.length-2]*nums[nums.length-1])/((long)div);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}