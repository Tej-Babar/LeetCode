/*
 * Find a common element in all rows of a given row-wise sorted matrix
 */

import java.util.HashMap;

public class FindCommon_71 {
    public static void main(String[] args) {
        int mat[][] = {
        { 1, 2, 3, 4, 5 },
        { 2, 4, 5, 8, 10 },
        { 3, 5, 7, 9, 11 },
        { 1, 3, 5, 7, 9 } };

        System.out.println(findCommon(mat));
    }
    static int findCommon(int mat[][]){
       
        int n=mat.length;
        int m=mat[0].length;

        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < m; i++) {
            if (!hm.containsKey(mat[0][i])) {
                hm.put(mat[0][i], 1);
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j==0) {
                    if (hm.containsKey(mat[i][j])) {
                        hm.put(mat[i][j], hm.get(mat[i][j])+1);
                    }
                }
                else if(hm.containsKey(mat[i][j]) && mat[i][j]!=mat[i][j-1]){
                    hm.put(mat[i][j], hm.get(mat[i][j])+1);
                }
            }
        }

        for (int key : hm.keySet()) {
            if (hm.get(key)==n) {
                return key;
            }
        }

        return -1;
    }
    
}
