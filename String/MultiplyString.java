import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {
        System.out.println(multiply1("123456789", "987654432211"));
        System.out.println(multiply("23", "10"));
        
    }
    public static String multiply(String s, String t){
        if(s=="0" || t=="0") return "0";
        int[] arr=new int[s.length()+t.length()];
        s=new StringBuilder(s).reverse().toString();
        t=new StringBuilder(t).reverse().toString();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                int num1=s.charAt(i)-'0';
                int num2=t.charAt(j)-'0';
                int num=(num1*num2);

                arr[i+j]+=num;
                arr[i+j+1]+=arr[i+j]/10;
                arr[i+j]=arr[i+j]%10;

            }
        }
        StringBuilder sb=new StringBuilder();
        int i=arr.length-1;
        while (i>=0 && arr[i]==0) {
               i--; 
        }
        while (i>=0) {
            sb.append(arr[i]);
            i--;
        }
    
        return sb.toString();
    }



    public static String multiply1(String s, String t) {
            
        BigInteger b = new BigInteger(s);
        BigInteger c = new BigInteger(t);

        BigInteger a = b.multiply(c);

        String m = a.toString();
        return m;
    }
}
