class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int l=0,r=1,v=2;
      //  List<Integer> a=new ArrayList<>();
    // HashMap<Integer,Integer> a=new HashMap<>();
int j[]=new int[n];
Arrays.fill(j,0);
        for(int k[]:bookings){
            int s=k[l];
            int e=k[r];
            for(int i=s;i<=e;i++){
               j[i-1]=j[i-1]+k[v];
            }
        }
        // for(int j:a.values()){
        //     System.out.println(j);
        // }

    //         
    //        if(!a.containsKey(k[r])){
    //             a.put(k[r],k[v]);
    //         }else{
    //            // a.put(k[r],a.get(k[r])+k[v]);
    //            // a.put(k[l],a.get(k[l])+k[v]);
    //             a.put(k[r],a.get(k[r])+k[v]);
    //         }
    //        // }

        // int p[]=new int[n];
        // Arrays.fill(p,0);
        // int i=0;
        // for(int k:a.keySet()){
        //     p[k-1]=a.get(k);
        // }
        return j;
        
    }
}