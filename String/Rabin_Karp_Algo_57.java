public class Rabin_Karp_Algo_57 {

    public static void main(String[] args) {
        String text="GEEKS FOR GEEKS";
        String pat="GEEK";
        RabinKarp(text, pat);
    }
    static void RabinKarp(String text,String pat){
        int m=text.length();
        int n=pat.length();

        int x=31;
        long x_m=1;
        long mod=1000000000;

        long t=0;
        long p=0;
        for (int i = 0; i < n-1; i++) {
            x_m=(x_m*x)%mod;
        }
        for (int i = 0; i < n; i++) {
            t=(t*x + text.charAt(i)-'a'+1)%mod;
            t=(t+mod)%mod;
            p=(p*x + pat.charAt(i)-'a'+1)%mod;
            p=(p+mod)%mod;
        }

        for (int i = 0; i <=m-n; i++) {
            if (p==t) {
                System.out.println("Pattern match at "+i +" to "+(i+n-1));
              
            }

            if(i<m-n){
                t=(x*(t-(text.charAt(i)-'a'+1)*(x_m)) +text.charAt(i+n)-'a'+1)%mod;
            }
            if (t<0) {
                t=(t+mod)%mod;
            }
        }
    }
}