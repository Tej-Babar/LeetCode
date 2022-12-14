/*
 * Suppose there is a circle. There are N petrol pumps on that circle. 
 * You will be given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.
Find a starting point where the truck can start to get through the complete circle 
without exhausting its petrol in between.
Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.
 */

public class Circular_Tour_172 {

    public static void main(String[] args) {
        int [] Petrol = {4, 6 ,7, 4};
        int Distance[] ={6,5,3,5} ;
        System.out.println(tour(Petrol, Distance));
    }
    static class Pair{
        int p;
        int d;
        Pair(int i,int j){
            p=i;
            d=j;
        }
    }

    static int tour(int petrol[], int distance[]){

        int n = petrol.length;
        int shortage=0;
        int balance =0;
        int start =0;
        
	    for(int i =0;i<n;i++){
	        
	        balance+= petrol[i]-distance[i];
	        
	        if(balance<0){
	            shortage += balance;
	            start = i+1;
	            balance =0;
	        }
	    }
	    
	    if((shortage+balance)>=0){
	        return start;
	    }
	    return -1;
    }
}