/*
 * You are given N pairs of numbers. 
 * In every pair, the first number is always smaller than the second number. 
 * A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed 
 * in this fashion. You have to find the longest chain which can be formed from the 
 * given set of pairs. 
 */

import java.util.Arrays;

public class Max_len_Chain_191 {

    public static void main(String[] args) {
        Pair pair[]=new Pair[5];

    }

    class Pair
    {
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }

    }
    int maxChainLength(Pair arr[], int n){

        int res=1;

        Arrays.sort(arr,(p1,p2)->Integer.compare(p1.y, p2.y));

        int min=arr[0].y;

        for (int i = 1; i < arr.length; i++) {
            if(min<arr[i].x){
                res++;
                min=arr[i].y;
            }
          
        }


        return res;


   
}

}