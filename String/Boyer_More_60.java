public class Boyer_More_60 {
    public static void main(String[] args) {
        Match("aabaaabaaacd","baac");
    }

    static void BadChar(int[] badchar,String pat){
        for (int i = 0; i < badchar.length; i++) {
            badchar[i]=-1;
        }

        for (int i = 0; i < pat.length(); i++) {
            badchar[pat.charAt(i)]=i;
        }
     
    }

    static void Match(String text,String pattern){
        int m=pattern.length();
        int n=text.length();

        int[] badchar =new int[256];
        BadChar(badchar, pattern);

        int s=0;
   
        while (s<=n-m) {
            int j=m-1;
            while (j>=0 && text.charAt(s+j)==pattern.charAt(j)) {
            
                j--;
            }

            if (j<0) {
                System.out.println("Pattern found at "+s);

                s+=s<(n-m)?m-badchar[text.charAt(s+m)]:1;
            }
            else{

                s+=Math.max(1, j-badchar[text.charAt(s+j)]);
            }
        }
    }
}
