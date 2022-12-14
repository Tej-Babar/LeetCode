public class Capitalize {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe ok";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        String[] arr=title.split(" ");
        int len=arr.length;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < len; i++) {
            String s=arr[i];
            if(s.length()<=2){
                s=s.toLowerCase();

            }
            else{
                char cr=s.charAt(0);
                if(cr>='a') cr=(char)(cr-32);
                s=cr+s.substring(1).toLowerCase();
                  
            }
            sb.append(s);
            if(i!=len-1) sb.append(" ");
            
        }

        return sb.toString();
    }
    
}
