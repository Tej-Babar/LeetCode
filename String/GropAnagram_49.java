/*
 * 49. Group Anagrams

Given an array of strings strs,
 group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters 
of a different word or phrase,
 typically using all the original letters exactly once.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class GropAnagram_49 {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans=groupAnagrams(strs);
        for (List<String> list : ans) {
            for (String list2 : list) {
                System.out.print(list2+" ");
            }
            System.out.println();
        }    
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new LinkedList<>();
        HashMap<String,List<String>> hm=new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s=strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=String.copyValueOf(c);

            if (!hm.containsKey(key)) {
                List<String> l=new LinkedList<>();
                l.add(s);
                hm.put(key, l);
            } else {
                List<String> l=hm.get(key);
                l.add(s);
                hm.replace(key,l);
                
            }
        }

        for(String s : hm.keySet()){
            res.add(hm.get(s));
        }

        return res;
    }
}
