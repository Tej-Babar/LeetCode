/*
 * Find maximum height pyramid from the given array of objects
 */

public class Max_heighr_Pyramid_185 {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 50, 60, 70};
        System.out.print(Pyramid(arr));
        
    }

    public static int Pyramid(int arr[]){
        int n=arr.length;
        int res=(int)Math.sqrt(2*n);
        if(res*(res+1)>2*n){
            res--;
        }
        return res;

    }
}
