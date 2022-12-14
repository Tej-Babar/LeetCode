/*
 * Input: m = 3, n = 3
Output: Following matrix 
X X X
X 0 X
X X X

Input:  m = 6, n = 7
Output: Following matrix
X X X X X X X
X 0 0 0 0 0 X
X 0 X X X 0 X
X 0 X X X 0 X
X 0 0 0 0 0 X
X X X X X X X 
 */

import java.util.Arrays;

public class Matrix_OF_X_0_72 {
    public static void main(String[] args) {
        char[][] ans=make(8, 5);
        for (char[] cs : ans) {
            
            System.out.println(Arrays.toString(cs));
        }
    }

    static char[][] make(int n,int m){
        char[][] res=new char[n][m];

        int top=0;
        int right=m-1;
        int bottom=n-1;
        int left=0;
        int p=0;
        int ci=0;
        char c;
        while (top<=bottom && left<=right) {
            if (ci%2==0) c='X';
            else c='0';
            
            if (p==0) {
                
                for (int i = left; i <= right; i++) {
                    res[top][i]=c;
                }
                top+=1;
                p=1;
            }
             if (p==1) {
                for (int i = top; i <= bottom; i++) {
                    res[i][right]=c;
                }
                right-=1;
                p=2;
            }
             if (p==2) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i]=c;
                }
                bottom-=1;
                p=3;
            }
             if (p==3) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left]=c;
                }
                left+=1;
                p=0;
            }
            ci++;

        }


        return res;
    }
}
