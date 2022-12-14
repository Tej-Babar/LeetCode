import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;

public class MinimumPlatform {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

            int n=Integer.parseInt(br.readLine());
            System.out.println(n);
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < dep.length; i++) {
            hm.put(dep[i], i);
        }
        Arrays.sort(dep);
        Queue<Integer> queue=new ArrayDeque<>();

        int result=1;
        queue.add(dep[0]);

        for (int i = 1; i < dep.length; i++) {
            
            if (arr[hm.get(dep[i])]>queue.peek()) {
                queue.poll();
                queue.add(dep[i]);
            } else {
                queue.add(dep[i]);
                result++;
            }
        }

        return result;
        
    }
}