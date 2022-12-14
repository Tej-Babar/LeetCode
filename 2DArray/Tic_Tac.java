import java.util.Scanner;

public class Tic_Tac {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();


       while (T>0) {
        int n=sc.nextInt();
        
        if (n<=3) {
            System.out.println(-1);
        }
        else{
            for (int i = n-1; i>0; i-=2) {
                System.out.print(i+" ");
            }
            for (int i = n; i>0; i-=2) {
                System.out.print(i+" ");
            }

        }
        

       
        
        T--;
       }
    }
    
}