class Solution {
    public int maxArea(int[] height) {
        int max=0,temp=0;
        int i=0,n=height.length-1;
        int j=0;
        while(i<=n){
           int area = Math.min(height[i], height[n]) * (n - i);
            max = Math.max(max, area);

            if (height[i] < height[n]) {
                i++;
            } else {
                n--;
            }
        }

        return max;
    }
}