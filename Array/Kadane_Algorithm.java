public class Kadane_Algorithm {
    public static void main(String[] args) {
        int Arr[] = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(Arr, Arr.length));
    }

    static long maxSubarraySum(int arr[], int n){
        
        long cur=0;
        long sum=arr[0];
        
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            
            if(cur>sum){
                sum=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        
        return sum;
    }
    
}



