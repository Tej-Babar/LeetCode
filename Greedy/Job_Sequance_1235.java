import java.util.Arrays;

public class Job_Sequance_1235 {
    public static void main(String[] args) {
        int a=(int)Math.pow(10, 9);
        
        System.out.println(Math.pow(10, 9));
        System.out.println(a==Math.pow(10, 9));
    }

    class Job {
        int st, en, profit;
        Job(int x, int y, int z){
            this.st = x;
            this.en = y;
            this.profit = z; 
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int res=0;
        int n=startTime.length;
        Job job[]=new Job[n];
        for (int i = 0; i <n; i++) {
            job[i]=new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(job,(p1,p2)->Integer.compare(p1.en, p2.en));

        int dp[]=new int[1000000001];
        int prvpro=0;
        int back=0;
        for (Job j : job) {
            int st=j.st,en=j.en,pro=j.profit;

            for (int i = back; i < en; i++) {
                dp[i]=prvpro;
            }
            dp[en]=pro+dp[st];
            back=en+1;
            prvpro=pro;
        }

        int i=job[n-1].en;

        while (i>0) {
            if(dp[i]>res) res=dp[i];
            i--;
        }

        return res;

    }
}
