import java.util.ArrayList;
import java.util.Arrays;

public class FourSum_92 {
    public static void main(String[] args) {
        int[] arr= {10,2,3,4,5,7,8};
        ArrayList<ArrayList<Integer>> ans=fourSum(arr, 23);
        for (ArrayList<Integer> arrayList : ans) {
            for (int arrayList2 : arrayList) {
                System.out.println(arrayList2);
            }
            System.out.println();
        }

      
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int n=arr.length;
        //int[][] sum=new int[n][n];
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                int s=j+1,e=n-1;
                while (s<e) {
                    if (arr[i]+arr[j]+arr[s]+arr[e]==k) {
                        ArrayList<Integer> l=new ArrayList<>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[s]);
                        l.add(arr[e]);
                        if(!list.contains(l))  list.add(l);
                        s++;
                        e--;
                    }
                    else if (arr[i]+arr[j]+arr[s]+arr[e]<k){
                        s++;
                    }
                    else e--;

                }
            }
        }

        

        return list;

    }
}
