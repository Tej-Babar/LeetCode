/*
 * Given an infinite supply of each denomination of Indian currency 
 * { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
Find the minimum number of coins and/or notes needed to make the change for Rs N. 
You must return the list containing the value of coins required. 
 */

import java.util.ArrayList;
import java.util.List;

public class Minimum_Coins_182 {
    public static void main(String[] args) {
        List<Integer> ans=minPartition(43);
        System.out.println(ans);
    }

    static List<Integer> minPartition(int N)
    {
        List<Integer> res=new ArrayList<>();
        int coins[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int ncoin[]=new int[N+1];
       int take[]=new int[N+1];
        int prevind[]=new int[N+1];
        int m,min,getc=0;
        for (int i = 1; i <=N; i++) {
            min=N+1;getc=0;
            while (getc<10  && coins[getc]<=i) {
                m=1+ncoin[i-coins[getc]];
                if(m<min){
                    take[i]=coins[getc];
                    prevind[i]=i-coins[getc];
                    ncoin[i]=m;
                    min=m;
                }
                getc++;
            }
        }
  

        int i=N;
        while (i>0 && prevind[i]!=0) {
           
            res.add(0,take[i]);
            i=prevind[i];
        }
        res.add(0,take[i]);
        
        
        return res;
        
    }

    

}
