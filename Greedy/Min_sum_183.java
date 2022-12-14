import java.util.Arrays;

public class Min_sum_183 {
    public static void main(String[] args) {
        int arr[]={6,8,4,5,2,3};
        int n=6;
        System.out.println(minSum(arr, n));
    }
    public static long minSum(int arr[], int n)
    {
        long res=0;
        long num1=0,num2=0;
        Arrays.sort(arr);
        int i=0;
        while (i<n && arr[i]==0) {
            i++;
        }
        int j=i+1;
        long p=10;
        while (i<n && j<n) {
            num1=num1*p+arr[i];
            num2=num2*p+arr[j];
            i+=2;
            j+=2;
           
        }

        if(i<n) num1+=arr[i]*p;
        System.out.println(num1);
        System.out.println(num2);
        return num1+num2;
    }
}
