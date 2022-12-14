public class LongPalinSubStr_50 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome1(String s) {
        
        int start = 0;
               int end = 0;
               for(int i=0; i<s.length(); i++){
                   int len1 = findPalindrome(s,i,i);
                   int len2 = findPalindrome(s,i,i+1);
                   int maxLength = Math.max(len1, len2);
                   if(maxLength > end - start){
                       start = i - (maxLength-1)/2;
                       end = i + maxLength/2;
                   }
               }
               return s.substring(start, end+1);
            }

            public static int findPalindrome(String s, int left, int right){
               
                while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                return right - left - 1;
            }
           
          
           
       
    public static String longestPalindrome(String s) {
       // int maxlen=0;
        int l=s.length();
        int st=0,en=0;
        int[][] arr= new int[l][l];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i]=1;
            if (i<=l-2) {
                if(s.charAt(i)==s.charAt(i+1)){
                st=i;en=i+1;
                arr[i][i+1]=1;
                }
                else
                arr[i][i+1]=0;
            }
        }
        for (int j= 2; j < arr.length; j++) {
            for (int i = 0; i < arr.length-j; i++) {
                if(s.charAt(i)==s.charAt(i+j)){
                    if (arr[i+1][i+j-1]==1) {
                        arr[i][i+j]=1;
                        st=i;en=i+j;
                    }
                    else
                    arr[i][i+j]=0;
                    }
                    else
                    arr[i][i+j]=0;  
            }
        }
    
        
        return s.substring(st,en+1);

    }
}
