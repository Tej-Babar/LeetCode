import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class maxSwapToSort {
    public static void main(String[] args) {
        
    }
    public int minSwaps(int nums[])
    {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[]= Arrays.copyOfRange(nums, 0, n);
        
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            hm.put(nums[i], i);
        }
        int count = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] != nums[i])
            {
                int element = nums[i];
                int index=hm.get(arr[i]);

                swap(nums,index,i);
                
                hm.replace(arr[i], i);
                hm.replace(element, index);
                count++;
            }
            
        }
        return count;
    }
    private void swap(int nums[],int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
