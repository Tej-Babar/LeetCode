/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
                    1
                1       1
            1       2       1
        1       3       3       1
 */

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        res.add(l);

        for(int i=2;i<=numRows;i++){
            List<Integer> arr=res.get(i-2);
            int len=arr.size();
            List<Integer> li=new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if(j!=1 && j!=len+1){
                    li.add(arr.get(j-2)+arr.get(j-1));
                }
                else{
                    li.add(arr.get(0));
                }
            }

            res.add(li);
        }

        return res;
    }
}
