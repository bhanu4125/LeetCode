class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     HashMap<Integer,Integer> map=new HashMap<>();
        //     for(int j=i;j<nums.length;j++){
        //         int count = map.getOrDefault(nums[j], 0);
        // if (count >= k) {
        //     break;
        // }
        //         map.put(nums[j],count+1);
        //     max=Math.max(max,j-i+1);
        //     }
        // }
        // return max;
         int n = nums.length;
        Map<Integer, Integer> frequency = new HashMap();
        int start = 0;
        int charsWithFreqOverK = 0;
        
        for (int end = 0; end < n; end++) {
            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
            if (frequency.get(nums[end]) == k + 1) { 
                charsWithFreqOverK++;
            }
            if (charsWithFreqOverK > 0) { 
                frequency.put(nums[start], frequency.get(nums[start]) - 1); 
                if (frequency.get(nums[start]) == k) { 
                    charsWithFreqOverK--; 
                }
                start++;
            }
        }
        return n - start; 
    }
}