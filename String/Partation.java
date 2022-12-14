/*
   763. Partition Labels
 * You are given a string s. We want to partition the string into as many parts as 
 * possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, 
the resultant string should be s.

Return a list of integers representing the size of these parts.
 */

import java.util.ArrayList;
import java.util.List;

public class Partation {
    public static void main(String[] args) {

        String s="eccbbbbdec";
        System.out.println(partitionLabels(s));

    }
    public static List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int i=0,m;
        int max;
        int len=s.length();
        int l=0;
        while (i<len) {
            max=s.lastIndexOf(s.charAt(i));
            while (i<=max) {
                m=s.lastIndexOf(s.charAt(i));
                if(m>max) max=m;
                i++;
            }
            res.add(i-l);
            l=i;

        }

        return res;
    }
}
