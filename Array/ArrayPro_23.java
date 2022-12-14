import java.util.Arrays;

/*Given an integer array nums,
 return an array answer such that answer[i] is equal to the product of all the elements of nums
  except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation. */

public class ArrayPro_23 {
    public static void main(String[] args) {
        int[] nums={3,4,2,1,5,2};
        int[] ans=productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] op=new int[nums.length];
        op[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            op[i]=nums[i]*op[i-1];
        }
        
        int pr=1;
        
        for(int i=nums.length-1;i>=1;i--){
            int temp=nums[i];
            op[i]=op[i-1]*pr;
            pr=pr*temp;
            
        }
        op[0]=pr;
        
        return op;
    }
}

