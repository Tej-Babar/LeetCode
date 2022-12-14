import java.util.HashMap;

public class ConcatPal {
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));
    }

    public static int longestPalindrome(String[] words) {
        HashMap<String,Integer> hm=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        int res=0;
        boolean f=false;
        for (String word : words) {
            char c0=word.charAt(0);
            char c1=word.charAt(1);
            String s=""+c1+c0;
            if (c0==c1) {
                hm2.put(word, hm2.getOrDefault(word, 0)+1);
            }
            
            else if (hm.containsKey(s) ){
                hm.remove(word);
                res+=4;
            } else {
                hm.put(word, hm.getOrDefault(word, 0)+1);
            }

            
        }
        for (String key : hm2.keySet()) {
            int k=hm2.get(key)/2;
            res+=k*4;
            if (hm2.get(key)%2!=0) {
                f=true;
            }
        }
        if (f) {
            res+=2;
        }
        return res;
    }
}
