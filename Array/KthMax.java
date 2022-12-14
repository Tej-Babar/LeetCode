
import java.util.HashSet;

public class KthMax {
    
public static void main(String[] args) {
    int[] arr={11 ,21, 23, 2 ,6 ,20, 7, 12, 15, 20, 14, 9 ,24, 32, 14, 7};
    System.out.println(kthMex(16, 15, arr));

}

    
static int kthMex(int n, int k, int arr[]) {

   HashSet<Integer> hashSet=new HashSet<>();

   for (Integer i : arr) {
     hashSet.add(i);
   }
 int i=0;
 int ans=0;
 int p=k;
   while(i<k+n){
    if (!(hashSet.contains(i))) {
      
        ans=i;
        p--;
        if(p==0){
            return ans;
        }
        
        
    }
    i++;
  

   }
return ans;
    
    
}
}