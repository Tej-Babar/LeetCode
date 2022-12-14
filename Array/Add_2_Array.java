/*
 * Given two numbers represented by two different arrays A and B. 
 * The task is to find the sum array. The sum array is an array representation 
 * of addition of two input arrays.
 */

import java.util.ArrayList;

import java.util.Collections;

public class Add_2_Array {
    public static void main(String[] args) {
        int[] a={1,2,3,5,0};
        int[] b={1,2,3};
        ArrayList<Integer> ans=findSum(a, b);
        for (Integer integer : ans) {
            System.out.print(integer+" ");
        }

    }
    static ArrayList<Integer> findSum(int a[], int b[]) {
        ArrayList<Integer> arr=new ArrayList<>();
        int c=0;
        int ai=a.length-1;
        int bi=b.length-1;
       
        
        while (ai>=0 && bi>=0) {
            int ans=a[ai]+b[bi]+c;
            arr.add(ans%10);
            c=ans/10;
            ai--;
            bi--;
            
        }
        while (ai>=0) {
            int ans=a[ai]+c;
            arr.add(ans%10);
            c=ans/10;
            ai--;
           
           
        }
        while (bi>=0) {
            int ans=b[bi]+c;
            arr.add(ans%10);
            c=ans/10;
            bi--;
            
        }
        if (c!=0) {
            arr.add(c);
        }
        Collections.reverse(arr);
        return arr;

    }
}
