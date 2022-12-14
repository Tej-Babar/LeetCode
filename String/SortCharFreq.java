/*
 * 451. Sort Characters By Frequency
 * Given a string s, sort it in decreasing order based on the frequency of the characters. 
 * The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 
 */
import java.util.Arrays;

public class SortCharFreq {
    public static void main(String[] args) {
        String s="2a554442f544asfasssffffasss";
        System.out.println(frequencySort(s));
        System.out.println('z'+0);
    }

    static class Store{
        int i;
        int fre;
        Store(int a,int b){
            i=a;
            fre=b;
        }
    }

    public static  String frequencySort(String s) {
        int len=s.length();
        int arr[]=new int[123];
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i)]++;
        }
        
        Store st[]=new Store[123];
        for (int i = 0; i < 123; i++) {
            st[i]=new Store(i, arr[i]);
        }

        Arrays.sort(st, (s1,s2)->Integer.compare(s2.fre,s1.fre));
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<123 && st[i].fre!=0) {
            char c=(char)(st[i].i);
            int cou=st[i].fre;
            while (cou>0) {
                sb.append(c);
                cou--;
            }
            i++;
        }

        return sb.toString();
    }
}
