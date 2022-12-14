import java.util.Arrays;
import java.util.HashSet;

/*Given an integer array nums,
 return true if any value appears at least twice in the array, 
and return false if every element is distinct. */

public class ContainsDuplicate_15 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate1(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        if (len==0) {
            return false;
        }
        int temp=nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i]==temp) {
                return true;
            }
            else{
                temp=nums[i];
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> hSet=new HashSet<>();
        for (int i : nums) {
            hSet.add(i);
        }

        if (hSet.size()==nums.length) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> hSet=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hSet.add(nums[i]);

            if (hSet.size()!=i+1) {
                return true;
            } 
        }
        return false;
    }
}
