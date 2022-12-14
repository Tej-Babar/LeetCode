/*
349. Intersection of Two Arrays

 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order
 .
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        HashSet<Integer> ans=new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if(hs.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int res[]=new int[ans.size()];
        int k=0;
        for (int i : ans) {
            res[k]=i;
            k++;
        }
        return res;
    }

    /*
    350. Intersection of Two Arrays II
    Given two integer arrays nums1 and nums2, return an array of their intersection. 
    Each element in the result must appear as many times as it shows in both arrays and 
    you may return the result in any order. */

    public int[] intersect(int[] nums1, int[] nums2) {
        int arr[]=new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            int k=nums1[i];
            arr[k]++;
        }
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int k=nums2[i];
            if(arr[k]!=0){
                l.add(k);
                arr[k]--;
            }
        }

        int res[]=new int[l.size()];
        int k=0;
        for (int i : l) {
            res[k]=i;
            k++;
        }

        return res;


    }
}
