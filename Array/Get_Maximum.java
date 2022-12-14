/*
You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:

nums[0] = 0
nums[1] = 1
nums[2 * i] = nums[i] when 2 <= 2 * i <= n
nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
*/
public class Get_Maximum {

    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
    }


public static int getMaximumGenerated(int n) {
    int ans;
   if(n==0){
     ans=0;  
     return ans;
   }
   else{
     ans=1;  
   }
   int[] arr=new int[n+1];
   arr[0]=0;
   arr[1]=1;
  
   for(int i=2;i<=n;i++){
       if(i%2==0){
           arr[i]=arr[i/2];
       }
       else{
           arr[i]=arr[i/2]+arr[(i/2)+1];
       }
       
       ans=Math.max(ans,arr[i]);
       
   }
   
   return ans;
}
   

}