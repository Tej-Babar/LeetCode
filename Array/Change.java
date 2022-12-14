/* 860. Lemonade Change
 * At a lemonade stand, each lemonade costs $5. 
 * Customers are standing in a queue to buy from you and order one at a time 
 * (in the order specified by bills). Each customer will only buy one lemonade and pay 
 * with either a $5, $10, or $20 bill. You must provide the correct change to each 
 * customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, 
return true if you can provide every customer with the correct change, or false otherwise.
 */

public class Change {
    public static void main(String[] args) {
        int bills[] = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for (int i = 0; i < bills.length; i++) {

            int ret=bills[i];
            if (ret==5) {
                five++;
            }
            else if(ret==10){
                ten++;
            }
            ret-=5;
            while (ret>0) {
                if (ten>0 && ret>=10) {
                    ret-=10;
                    ten--;
                }
                else if(five>0 && ret>=5){
                    ret-=5;
                    five--;
                }
                else{
                    return false;
                }
            }
        }
        

        return true;
    }
}
