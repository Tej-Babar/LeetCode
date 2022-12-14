/*307. Range Sum Query - Mutable
 * Given an integer array nums,
 *  handle multiple queries of the following types:

Update the value of an element in nums.
Calculate the sum of the elements of nums between indices left and right 
inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
void update(int index, int val) Updates the value of nums[index] to be val.
int sumRange(int left, int right) Returns the sum of the elements of nums between 
indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 */

import java.util.Arrays;

public class NumArray {

    int arr[];int sum[];int len;
    public NumArray(int[] nums) {
        this.arr=nums;
        len=nums.length;
        sum=new int[(len/100)+1];
        Sum();
        
    }
    public void Sum(){
        int interval=len/100;
        int i=0,st=0,k=0;

        while (interval>0) {
            while (k<100) {
                sum[st]+=arr[i];
                i++;
                k++;
            }
            k=0;
            st++;
            interval--;
        }
        while (i<len) {
            sum[st]+=arr[i];
            i++;
        }


    }
    
    public void update(int index, int val) {
        sum[index/100]-=arr[index];
        sum[index/100]+=val;
        arr[index]=val;
    }
    
    public int sumRange(int left, int right) {
        int res=0;
        for (int i = left/100; i < right/100; i++) {
            res+=sum[i];
        }
        for (int i = (left/100)*100; i < left; i++) {
            res-=arr[i];
        }
        for (int i = (right/100)*100; i <= right; i++) {
            res+=arr[i];
        }

        return res;
    }
}
