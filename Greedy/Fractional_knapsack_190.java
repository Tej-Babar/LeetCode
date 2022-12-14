import java.util.Arrays;

public class Fractional_knapsack_190 {

    public static void main(String[] args) {
        
    }

    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }

        double fractionalKnapsack(int W, Item arr[], int n) 
        {
            double res=0;

            Arrays.sort(arr,(p1,p2)->Float.compare(p2.value/p2.weight, p1.value/p1.weight));

            int i=0;
            while (i<n && W>0) {
                if (W>=arr[i].weight) {
                    W-=arr[i].weight;
                    res+=arr[i].value;
                } 
                else {
                    res+=((float)(float)(W)*(float)(arr[i].value))/(float)(arr[i].weight);
                    //res+=(W/arr[i].weight)* arr[i].value;
                    break;
                }
            }
            return res;
        }
    
}