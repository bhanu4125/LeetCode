        class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) 
        return false;

        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
                if (freq[ch - 'a'] > 1) 
                return true;
            }
            return false;
        }

        int first = -1, second = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return false;
            }
        }

        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
        }
   // String k=s+s;
        // if(k.substring(1,k.length()-1).contains(goal)){
        //     return true;
        // }else{
        //     return false;
        // }
        // if(s.length()!=goal.length()){
        //     return false;
    //     }int v=0;
    //     HashMap<Character,Integer> a=new HashMap<>();
    //     HashMap<Character,Integer> b=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         a.put(ch,a.getOrDefault(ch,0)+1);
    //     }
    //     for(int i=0;i<goal.length();i++){
    //         char ch=goal.charAt(i);
    //         b.put(ch,b.getOrDefault(ch,0)+1);
    //         }
    //  //   for(int i=0)
    //     int [] c=new int[a.size()];
    //     int [] d=new int[b.size()];
    //     int i=0;
    //     for(int k: a.values()){
    //         c[i++]=k;
    //     }
    //     i=0;
    //     for(int k:b.values()){
    //         d[i++]=k;
    //     }
    //     Arrays.sort(c);
    //     Arrays.sort(d);
    //     if(Arrays.equals(c,d)){
//         for( i=0;i<s.length();i++){
//             if(s.charAt(i)!=goal.charAt(i))
//         v++;
//             if(v==2){
//                 return true;
//             }
//         }
//         return false;
//             // return true;
//         }else{
//             return false;
        
//     }
// }
// }