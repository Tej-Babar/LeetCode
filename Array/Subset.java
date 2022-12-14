import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
       
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int k=j;
                int p=i;
                List<Integer> l=new ArrayList<>();
                while (p>0 && k<nums.length) {
                    l.add(nums[k]);
                    k++;
                    p--;
                }
                
                hs.add(l);
            }
        }
        List<List<Integer>> res=new ArrayList<>(hs);
        return res;
    }
}
