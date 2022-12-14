/*
 * Given N activities with their start and finish day given in array start[ ] and end[ ].
 *  Select the maximum number of activities that can be performed by a single person, 
 * assuming that a person can only work on a single activity at a given day.
Note : Duration of the activity includes both starting and ending day.
 */

import java.util.Arrays;

public class ActivitySelectio_181 {
    public static void main(String[] args) {
        int N = 4;
        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};

        System.out.println(activitySelection(start, end, N));
    }

    static class Pair{
        int a,b;
        Pair(int i,int j){
            a=i;
            b=j;
        }
    }

    public static int activitySelection(int start[], int end[], int n)
    {
        int res=1;
        Pair pair[]=new Pair[n];
        for (int i = 0; i < n; i++) {
            pair[i]=new Pair(start[i], end[i]);
        }

        Arrays.sort(pair,(p1,p2)->Integer.compare(p1.b, p2.b));
     
        int en=pair[0].b;
        for (int i = 1; i < pair.length; i++) {
            if(pair[i].a>en) {
                res++;
                en=pair[i].b;
            }
        }

        return res;
        
    }
}
