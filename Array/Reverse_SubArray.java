/*
You are given an integer array nums. The value of this array is defined as the sum of |nums[i] - nums[i + 1]| for all 0 <= i < nums.length - 1.

You are allowed to select any subarray of the given array and reverse it. You can perform this operation only once.

Find maximum possible value of the final array.
*/

public class Reverse_SubArray {
public static void main(String[] args) {
    int[] nums={2,5,1,3,4};
    System.out.println(maxValueAfterReverse(nums));
}
    public static int maxValueAfterReverse(int[] nums) {
        int ans=0;
        int l=nums.length;
        if (l<=2) {
           for (int i = 0; i<l; i++) {
               ans=Math.abs(ans-nums[i]);
           } 
     
           return ans;
        }
        int f1,f2,l1,l2,in1=0,in2=1,dif,cdif;
        int maxdif=0;
        for (int i = 0; i < l-1; i++) {
            f1=i;
            f2=i+1;
            for (int j = f2+1; j < l-1; j++) {
                l1=j;
                l2=j+1;

                dif=Math.abs(nums[f1]-nums[l1])+Math.abs(nums[f2]-nums[l2]);
                cdif=Math.abs(nums[f1]-nums[f2])+Math.abs(nums[l1]-nums[l2]);
                
                if (dif>maxdif && dif>cdif) {
                    maxdif=dif;
                    in1=f1;
                    in2=l1;
                   
                }
            }
        }

        for (int i = 0; i < l-1; i++) {
            ans=ans+Math.abs(nums[i]-nums[i+1]);
            System.out.println(ans);
        }
        // System.out.println(maxdif);
        // System.err.println(in1+" "+in2);
        if(maxdif==0){
            int m1=0,m2=0;
            if(Math.abs(nums[0]-nums[2])>Math.abs(nums[1]-nums[2])){
                m1=Math.abs(nums[0]-nums[2]);
            }
            if(Math.abs(nums[l-1]-nums[l-3])>Math.abs(nums[l-2]-nums[l-3])){
                m2=Math.abs(nums[l-1]-nums[l-3]);
            }
            if(m1>m2){
                return ans+m1-Math.abs(nums[1]-nums[2]);
            }
            else if(m2>m1){
                return ans+m2-Math.abs(nums[l-2]-nums[l-3]);
            }
            else{
                return ans;
            }
           // maxdif=Math.max(m1, m2);
           // ans=ans+maxdif-Math.abs(nums[in1]-nums[in1+1])-Math.abs(nums[in2]-nums[in2+1]);
        }
        else{
        ans=ans+maxdif-Math.abs(nums[in1]-nums[in1+1])-Math.abs(nums[in2]-nums[in2+1]);
        return ans;
        }
    }
}
   

