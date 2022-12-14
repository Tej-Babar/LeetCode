import java.util.HashMap;

public class MajorityElement_82 {
   /*
    * Given an array A of N elements.
     Find the majority element in the array.
      A majority element in an array A of size N is an element 
      that appears more than N/2 times in the array.

      Expected Time Complexity: O(N).
      Expected Auxiliary Space: O(1).
    */
   
    public static void main(String[] args) {
        
    }
    static int majorityElement1(int a[], int size){
        int can=findCandi(a);
        int res=0;
        for (int i : a) {
            if(i==can) res++;
        }
        return can=res>size/2?can:-1;
    }

    public static int findCandi(int[] arr){
        int maxindex=0;
        int count =1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[maxindex]) {
                count++;
            }
            else count--;

            if (count==0) {
                count=1;
                maxindex=i;
            }
        }
         return arr[maxindex];
    }

    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : a) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for (Integer i : hm.keySet()) {
            if (hm.get(i)>size/2) {
                return i;
            }
        }


        return -1;
    }
}
