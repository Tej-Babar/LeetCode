/*
120. Triangle

 * Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally,
 if you are on index i on the current row, you may move to either index i or index i + 1 
 on the next row.

 */

import java.util.List;

public class Triangle_sum {
    public static void main(String[] args) {
        
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> arr=triangle.get(i-1);
            List<Integer> cur=triangle.get(i);
            int l=triangle.get(i).size();
            for(int j=1;j<l-1;j++){
                cur.set(j,  Math.min(arr.get(j), arr.get(j-1))+cur.get(j));
            }
            cur.set(0, arr.get(0)+cur.get(0));
            cur.set(l-1, arr.get(l-2)+cur.get(l-1));
        }
        List<Integer> cur=triangle.get(triangle.size()-1);
        int res=cur.get(0);
        for (int i : cur) {
            if(i<res) res=i;
        }

        return res;

    }
}
