import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while (T>0) {
            String s=sc.next();
            s=s.toLowerCase();

            long[] arr=new long[26];

            for (int i = 0; i < s.length()/2; i++) {
                arr[s.charAt(i)-'a']+=1;
            }

            int st;
            if(s.length()%2==0) st=s.length()/2;
            else st=(s.length()/2)+1;

            for (int i = st; i < s.length(); i++) {
                arr[s.charAt(i)-'a']-=1;
            }
             boolean f=true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=0) {
                    System.out.println("No");
                    f=false;
                    break;
                }
            }

            if (f) {
                System.out.println("Yes");
            }


            T--;
        }
        sc.close();
    }
    
}
