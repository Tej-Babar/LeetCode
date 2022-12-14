import java.util.HashSet;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while (T>0) {
            int P=sc.nextInt();
            int Q=sc.nextInt();
            int R=sc.nextInt();
            int m=Math.max(P, Q);
            m=Math.max(m, R);
            int c;
           if ((P==0 && Q==0) || (P==0 && R==0) || (Q==0 && R==0)  ) {
            c=0;
           } else {
            c=1;
           }
            while (m!=0) {
                if ((P|0)==1 && (Q|0)==1 && (R|0)==1) {
                    c+=3;
                }
             
                m=m>>1;
                P=P>>1;
                Q=Q>>1;
                R=R>>1;
            }
            System.out.println(c);
            T--;
        }
    }
}
