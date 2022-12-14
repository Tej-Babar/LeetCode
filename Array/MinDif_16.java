import java.util.ArrayList;

import java.util.Collections;

public class MinDif_16 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(6);
        a.add(24);
        a.add(28);
        a.add(6);
        a.add(8);
        a.add(89);
        System.out.println(findMinDiff(a, a.size(), 3));

    }

    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);  
        if(n<m){
            return -1;
        }
        int mindif=Math.abs(a.get(0)-a.get(m-1));
        for(int i=1;i<n-m+1;i++){
            int dif=Math.abs(a.get(i)-a.get(i+m-1));
            if (dif<mindif) {
                mindif=dif;
            }
        }

        return mindif;
    }
}
