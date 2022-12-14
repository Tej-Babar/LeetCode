import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Min_Num_1505 {
    public static void main(String[] args) {
        String num="9438957234785635408";
        int k=23;
        minInteger(num, k);
    }

    public static String minInteger(String num, int k) {
        
        LinkedHashMap<Character,List<Integer>> hm=new LinkedHashMap<>();
        StringBuilder sb=new StringBuilder();
        int n=num.length();
        for (int i = 0; i <=9; i++) {
            List<Integer> list=new ArrayList<>();
            hm.put((char)('0'+i), list);
        }

        
        int arr[]=new int[10];

        for (int i = 0; i < n; i++) {
            char c=num.charAt(i);
            hm.get(c).add(i);
            arr[c-'0']++;
            
        }

        for (char key : hm.keySet()) {
            for (int i : hm.get(key)) {
                if(i<=k){
                    sb.append(key);
                    arr[key-'0']--;
                    k-=i;
                }
                else{
                    break;
                }
            }
        }
        for (int i = 0; i < num.length(); i++) {
            char c=num.charAt(i);
            if(arr[c-'0']>0){
                sb.append(c);
                arr[c-'0']--;
            }
        }
        System.out.println(sb);//"0345989723478563548"
        System.out.println(k);
        if(k>0 && k<n){
            for (int i = k; i >0; i--) {
                char c1=num.charAt(i);
                char c2=num.charAt(i-1);
                if(c1<c2){
                    String s=""+c1+c2;
                    sb.replace(i-1, i, s);

                }
            }
        }
       
        return sb.toString();
        
    }
}
