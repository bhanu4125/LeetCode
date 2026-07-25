class Solution {
    public int maxProduct(int n) {
        long g=0;
        int k=n;
        List<Integer> a=new ArrayList<>();
        while(k>0){
            int rem=k%10;
            a.add(rem);
            k=k/10;
        }
        Collections.sort(a);
        int p=a.size();
        return a.get(p-1)*a.get(p-2);
}
}