

public class SetMatrixZero_65 {

    public static void main(String[] args) {
        int[][] matrix={
            {0,1,2,0}
            ,{3,4,5,2}
            ,{1,3,1,5}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

         int[][] ij=new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                  ij[i][j]=matrix[i][j];
            }
        }
       
     
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ij[i][j]==0){
                   System.out.println(i+" "+j);
                    makezero(i,j,matrix);
                }
            }
        }
        
    }
    public static void makezero(int i,int j,int[][] matrix){
        for(int k=0;k<matrix[0].length;k++){
            matrix[i][k]=0;
        }
        for(int k=0;k<matrix.length;k++){
            matrix[k][j]=0;
        }
    }
}