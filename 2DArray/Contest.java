import java.util.Arrays;
import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int T=sc.nextInt();

        while (T>0) {
          int N=sc.nextInt();
          int arr[] = new int[N];
          for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
          }
       

          Arrays.sort(arr);
          int sum=arr[0];
          for (int i = 1; i < arr.length; i++) {
             for (int j = 0; j <= i; j++) {
              
               if (gcd(arr[i], arr[j])!=1) {
                  sum+=arr[j];
                  break;
               }
             }
          }

          System.out.println(sum);
            
            T--;
        }

        sc.close();

    }

    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
}
