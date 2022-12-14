import java.util.Arrays;

public class KMP_StringMatchAlogo {
    public static void main(String[] args) {
        KMP("aabaaabaaacd","aaac");
    }
    static void KMP(String S,String P){
        int m=S.length();
        int n=P.length();

        char[] PArr=P.toCharArray();
        int[] arr=new int[n];
        arr[0]=0;
        char c=PArr[0];
        int count=1;
        for (int i = 1; i < PArr.length; i++) {
            if (c==PArr[i]) {
                c=PArr[count];
                arr[i]=count;
                count++;
            }
            else{

                if (count>1) {
                    if(PArr[i-1]==PArr[i]){
                        arr[i]=arr[i-1];
                    }
                    else{
                        i--;
                    }
                }
                c=PArr[0];
                count=1;
                
            }
        }
        System.out.println(Arrays.toString(PArr));
        System.out.println(Arrays.toString(arr));
        int j=0;
        int i=0;
        while(i<m) {
            
            if (S.charAt(i)==PArr[j]) {
                i++;
                j++;
            }
            else{
                if (j!=0) {
                    j=arr[j-1];
                }
                else{
                    if (S.charAt(i)==PArr[j]) {
                        j++;
                    }
                    i++;
                }
            }
            if (j==n) {
                System.out.println("Pattern found At index "+(i-j) +" to "+(i-1));
                j=0;
            }
        }

    }
}
