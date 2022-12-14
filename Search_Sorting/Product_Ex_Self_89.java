/*
 * Product array puzzle
 * 
 * Given an array nums[] of size n,
 *  construct a Product Array P (of same size n) 
 * such that P[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * You do not have to read input. Your task is to complete the function productExceptSelf() that takes array nums[] and n as input parameters and returns a list of n integers denoting the product array P. If the array has only one element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.
 */

import java.util.Arrays;

public class Product_Ex_Self_89 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,1};
        System.out.println(Arrays.toString(productExceptSelf(nums, nums.length)));
    }
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    
        long[] pro=new long[n];
        if(n==1){
            pro[0]=1;
            return pro;
        }
        pro[0]=nums[0];
        for(int i=1;i<n;i++){
            pro[i]=pro[i-1]*nums[i];
        }
        
        long k=nums[n-1];
        pro[n-1]=pro[n-2];
        for(int i=n-2;i>0;i--){
            pro[i]=pro[i-1]*k;
            k=k*nums[i];
        }
        pro[0]=k;
        
        return pro;
        
	} 
} 


