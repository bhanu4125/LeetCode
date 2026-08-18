class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int[] b = new int[k];
            for (int j = 0; j < k; j++) {
                b[j] = nums[i + j];
            }
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < k; j++) {
                set.add(b[j]);
            }
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int ans = -1;
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}// class Solution {
//     public int largestInteger(int[] nums, int k) {
//         int b[]=new int[k];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<i+k;j++){
//                 b[j]=a[j];
//             }
//             int p=lar(b,k);
//         }
        
//     }
//     public int lar(int[] b,int k){
//         int m=0,u=0;
//         HashMap<Integer,Integer> a=new HashMap<>();
//         for(int i=0;i<n;i++){
//             a.put(b[i],a.getOrDefault(b[i],0)+1);
//         }
//        for(int i=0;i<a.length;i++){

//        }
//     }
// }