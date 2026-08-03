class Solution {
    public boolean stoneGame(int[] piles) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int n = piles.length;
        int i = 0;
        int j = n - 1;
        int c = 0;

        while (i <= j) {
            if (c % 2 == 0) {
                if (Math.max(piles[i], piles[j]) == piles[i]) {
                    a.add(piles[i]);
                    i++;
                } else {
                    a.add(piles[j]);
                    j--;
                }
            } else {
                if (Math.min(piles[i], piles[j]) == piles[j]) {
                    b.add(piles[j]);
                    j--;
                } else {
                    b.add(piles[i]);
                    i++;
                }
            }
            c++;
        }

        int sumA = 0, sumB = 0;
        for (int x : a) sumA += x;
        for (int x : b) sumB += x;

        return sumA > sumB;
    }
}// class Solution {
//     public boolean stoneGame(int[] piles) {
//     int c1=0,c2=0,k=1;
//         int i=0,n=piles.length-1;
//         while(i<=n){
//             if(k%2!=0){
//                 if(piles[i]>=piles[n]){
//                     c1+=piles[i];
//                     i++;
//                     k++;
//                 }else{
//                     c1+=piles[n];
//                     n--;
//                     k++;
//                 }
//             }else{
//                 if(piles[i]>=piles[n]){
//                     c2+=piles[i];
//                     i++;
//                     k++;
//                 }else{
//                     c2+=piles[n];
//                     n--;
//                     k++;
//                 }
//             }
//         }
//    System.out.println(c1);
//        System.out.println(c2);
//         if(c1>c2){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }
  