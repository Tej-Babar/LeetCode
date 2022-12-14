import java.util.HashMap;

public class Reorganize {
    public static void main(String[] args) {
        System.out.println(reorganizeString("sfffp"));
    }

    public static String reorganizeString(String s) {
        String ans="";
        HashMap<Character,Integer> hm=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key=s.charAt(i);
            hm.put(key, hm.getOrDefault(key, 0)+1);
        }
        char mchar=' ';
        for (int i = 0; i < s.length(); i++) {
            // char mchar=' ';
            int m=0;
        for (char c : hm.keySet()) {
            if (m<hm.get(c) && c!=mchar) {
                mchar=c;
                m=hm.get(c);
            }
        }
        if (m>(s.length()+1)/2) {
            return "";
        }
        hm.put(mchar, hm.get(mchar)-1);
        ans+=mchar;
        }
        


        return ans;


    }
}
