public class LongPreSuf_ {

    public static void main(String[] args) {
        String s="aabaab";
        System.out.println(lps(s));
    }
    static int lps(String s){
        int ans=0;
        if (s.length()<=1) {
            return -1;
        }
        int n=s.length();
        long pr=0;
        long su=0;

        long p=31;
        long pow=1;
        long mod=1000000000;
        for(int i=0;i<n-1;i++){
            pr=(pr*p+(s.charAt(i)-'a'+1))%mod;
            su=((su+(s.charAt(n-1-i)-'a'+1)*pow)%mod);
            pow=(pow*p)%mod;

            if (pr==su) {
                ans=i+1;
            }
        }


        return ans;
    }
    
    static int lps1(String s){
        int len=0;
        int l=s.length();
        if(l<2){
            return -1;
        }
        if (s.substring(0,l-1)==s.substring(1,l)) {
            len=l-1;
            return len;
        }

        char st=s.charAt(0);
        char en=s.charAt(l-1);
        for (int i = 1; i <l-len; i++) {
            if (s.charAt(i)==st) {
                //System.out.println(i);
                for (int j =l-1; j >i+len; j--) {
                    if (s.charAt(j)==en){
                       // System.out.println(i+""+j);
                        String sub=s.substring(i,j+1);
                        String s1=s.substring(l+i-j-1,l);
                        if(sub.equals(s1)){
                          // System.out.println(s1);
                          String s2=s.substring(0,j-i+1);
                            if(sub.equals(s2)){
                               // System.out.println(len);
                                len=Math.max(len,sub.length());
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }

        return len;
    }
    
}