/*
 * Given a set of N jobs where each jobi has a deadline and profit associated with it.

Each job takes 1 unit of time to complete and only one job can be scheduled at a time. 
We earn the profit associated with job if and only if the job is completed by its deadline.


Find the number of jobs done and the maximum profit.

Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.
 */

import java.util.Arrays;

public class Job_Sequance_188 {

    public static void main(String[] args) {
        
    }

    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }

    int[] JobScheduling(Job arr[], int n)
    {
        
        int p=0;
        int c=0;
        Arrays.sort(arr,(p1,p2)->Integer.compare(p2.profit, p1.profit));
        int pro[]=new int[101];

        for (Job job : arr) {
            int i=job.deadline;

            while (i>0 && pro[i]==-1) {
                i--;
            }
            if(i>0){
                pro[i]=-1;
                p+=job.profit;
                c++;
            }
        }
        int res[]={c,p};

        return res;
    }
}

