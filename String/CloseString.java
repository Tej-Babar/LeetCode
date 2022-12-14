/*
 * 1657. Determine if Two Strings Are Close
 * 
 * Two strings are considered close if you can attain one from the other using the 
 * following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another 
existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, 
and false otherwise
 */

import java.util.Arrays;

public class CloseString {
    public static void main(String[] args) {
        String word1="cabbba";
        String word2="aabbss";
        System.out.println(closeStrings(word1, word2));
    }

    public static boolean closeStrings(String word1, String word2) {

        int l1=word1.length();
        int l2=word2.length();

        if(l1!=l2) return false;

        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for (int i = 0; i < l1; i++) {
            arr1[word1.charAt(i)-'a']++;
            arr2[word2.charAt(i)-'a']++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < 26; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }


        return true;
        
    }
}
