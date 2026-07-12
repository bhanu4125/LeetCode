class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=new int[arr.length];
        a = arr.clone();
        Arrays.sort(a);
        int g=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
           // map.put(a[i],map.getOrDefault(a[i],++g));
           if (!map.containsKey(a[i])) {
        map.put(a[i], g++);
    }
        }
        int b[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            b[i]=map.get(k);
        }
        return b;
    }
}