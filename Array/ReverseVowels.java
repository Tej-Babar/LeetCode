import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char str[]=s.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');hs.add('e');hs.add('i');hs.add('o');
        hs.add('u');hs.add('A');hs.add('E');hs.add('I');
        hs.add('O');hs.add('U');

        int st=0,en=s.length()-1;

        while (st<en) {
            while (st<en && !hs.contains(str[st])) {
                st++;
            }
            while (st<en && !hs.contains(str[en])) {
                en--;
            }
            char c=str[st];
            str[st]=str[en];
            str[en]=c;
            st++;en--;

        }
        //Arrays.toString(str);

        StringBuilder sb=new StringBuilder();
        for (char c : str) {
            sb.append(c);
        }
        return sb.toString();
    }
}
