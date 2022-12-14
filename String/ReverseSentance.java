public class ReverseSentance {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] arr=s.split(" ");
    
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i].length()==0) {
                
            }
            else{
                
                sb.append(arr[i]+" ");
            }
        }
       
        String res=sb.substring(0,sb.length()-1);
        return res;
    }
}