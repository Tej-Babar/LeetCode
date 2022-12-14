import java.util.ArrayList;
import java.util.List;

public class Cutting_Rectangle_194 {
    public static void main(String[] args) {
        
    }

    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> list=new ArrayList<>();
        long A=0;
        while (L!=0 || B!=0) {

            if(L>B){
                 A+=(L/B)*B*B;
                 L=L%B;
            }
            else{
               A+=(B/L)*L*L;
               B=B%L;
            }
        }
        if(L==0){
            list.add(A/B);
            list.add(B);
        }else{
            list.add(A/L);
            list.add(L);
        }
        
        return list;
    }

}
