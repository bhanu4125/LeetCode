class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int max=-1,o=Integer.MAX_VALUE,p=0;
        for(int[] i:drones){
            //for(int j=0;j<i.length;j++){
                int k=Math.abs(i[0]-target[0])+Math.abs(i[1]-target[1]);
                //o=Math.min(o,k);
                 if(k<=i[2]){
                if(k<o){
                    o=k;
                    max=p;
                }
            }
            //if()
            p++;
        }
        return max;
    }
}