import java.util.HashSet;

public class FindUniqueChar {
    public static void main(String[] args) {
        
    }

    public int firstUniqChar(String s) {
      
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }

        return -1;
    }

    public char repeatedCharacter(String s) {
        int m=s.length();
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i <m; i++) {
            char cr=s.charAt(i);
            if(hs.contains(cr)){
                return cr;
            }
            else{
                hs.add(cr);
            }
        }
        

        return ' ';


    }
}
