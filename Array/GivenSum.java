import java.util.ArrayList;

public class GivenSum {
    public static void main(String[] args) {
        int A[] = {1,4,3,7,5};
        ArrayList<Integer> ans=subarraySum(A, A.length, 0);
        System.out.println(ans.get(0));
        System.out.println(ans.get(1));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if (s==0) {
            ans.add(-1);
            return ans;
        }

        int st=0;
        int en=0;
        int sum=0;
        while (st<n && en<n) {
            if (sum>s) {
                sum-=arr[st];
                st++;
            }
            else if(sum<s){
                sum+=arr[en];
                en++;
            }
            else{
                break;
            }

        }
   

        while (sum>s && st<=en) {
            sum-=arr[st];
            st++;
        }

        if (sum==s) {
            ans.add(st+1);
            ans.add(en);
        } else {
            ans.add(-1);
        }
        
       



        return ans;
    }
}
