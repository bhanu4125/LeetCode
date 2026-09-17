class Solution {
    public boolean rotateString(String s, String goal) {
        String k=goal+goal;
        if(k.contains(s)){
            return true;
        }
        return false;  
    }
}