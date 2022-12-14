import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while (T>0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            //int[][] dp=new int[n+1][m+1];
            int step=1;
            long[] ans={0};
            find(n-1,m-1,step,ans);
            System.out.println(ans[0]%998244353);
            T--;
        }
    }

    private static void find(int n, int m,int step,long[] ans) {
        if (n==0 && m==0) {
            //System.out.println(step+"*");
            if (step%2==0) {
                int p=step/2;
                long a=1;
                while(p<=step){
                    //System.out.println(a);
                    a=a*p;
                    p++;
                }
                ans[0]+=a;
            }
            return;
        }
        if (m>0) {
            find(n, m-1, step+1, ans);
            m++;
            step--;
        }
        if (n>0) {
            find(n-1, m, step+1, ans);
            n++;
            step--;
        }
        
    }

}

//     public static void removeLoop(ListNode head){
//         ListNode fast=head;
//         ListNode slow=head;
//         int fc=0,sc=0;

//         boolean f=false;

//         while (fast!=null && fast.next!=null) {
//             slow=slow.next;
//             fast=fast.next.next;
//             fc+=2;
//             sc++;

//             if (fast==slow) {
//                 f=true;
//                 break;
//             }
//         }

//         if (f) {
//             int c=fc-sc;
//             while (c>0) {
//                 slow=slow.next;
//                 c--;
//             }

//             slow.next=null;
//         }


//     }
// }
