class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int minSpeed = 1;
    int maxSpeed = 0;
    for (int pile : piles)
      maxSpeed = Math.max(maxSpeed, pile);
    while (minSpeed < maxSpeed) {
      int mid = minSpeed + (maxSpeed - minSpeed) / 2;
      if (canEatInTime(piles, h, mid))
        maxSpeed = mid;
      else
        minSpeed = mid + 1;
    }
    return minSpeed;
  }
  private boolean canEatInTime(int[] piles, int h, int speed) {
    int hours = 0;
    for(int pile : piles)
      hours += (int) Math.ceil((double) pile / speed);
    return hours <= h;
  }
}
//         int low = 1, high = 0;
//         for (int p : piles)
//         high = Math.max(high, p);

//         int ans = high;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             long hours = 0;

//             for (int p : piles) {
//                 hours += (p + mid - 1) / mid;
//             }

//             if (hours <= h) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return ans;
//     }
// }// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int c=0;
//         Arrays.sort(piles);
//         int rem=piles[piles.length-1]%h;
//         for(int i=0;i<piles.length;i++){
//             c=koko(piles,rem,h);
//             System.out.println(c);
//             if(c==h){
//                 return c;
//             }
//         }
//         return c;
//     }
//     public int koko(int[] piles,int rem,int h){
//         int y=0,k=0;
//         for(int i=0;i<piles.length;i++){
//             k=piles[i]%h;
//             y+=k;
//         }
//         return y;
//     }
// }