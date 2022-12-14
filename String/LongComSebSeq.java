

public class LongComSebSeq {
    public static void main(String[] args) {
        String text1="pmjghexybyrgzczy";
        
        String text2="hafcdqbgncrcbihkd";
        System.out.println(longestCommonSubsequence(text1, text2));

    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        return f(text1,text2,l1-1,l2-1);
    }

    public static int f(String s,String t,int sp,int tp){
        if (sp<0 || tp<0) {
            return 0;
        }
        if (s.charAt(sp)==t.charAt(tp)) {
            return 1+f(s,t,sp-1,tp-1);
        } else {
            return Math.max(f(s,t,sp,tp-1), f(s,t,sp-1,tp));
        }
    }
}
