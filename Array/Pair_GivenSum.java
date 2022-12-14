import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pair_GivenSum {
    public static void main(String[] args) {
        
    }

    class pair  {  
        long first, second;  
        public pair(long first, long second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    }
   
    
    class Solution {
        public pair[] allPairs( long A[], long B[], long N, long M, long X) {
            List<pair> list=new ArrayList<>();
            Arrays.sort(A);
            Arrays.sort(B);
            int i=0;
            int j=B.length-1;

            while (i<N && j>=0) {
                if(A[i]+B[j]==X){
                    list.add(new pair(A[i],B[j]));
                    i++;j--;
                }
                else if(A[i]+B[j]>X) j--;
                else i++;
            }
            
            pair res[]=new pair[list.size()];
            i=0;
            for (pair pair : list) {
                res[i++]=pair;
            }

            return res;
        }
    
    }
}
