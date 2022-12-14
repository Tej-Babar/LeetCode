import java.util.Arrays;

public class MaxBombDetect {
    public static void main(String[] args) {
        int bombs[][]={{2,1,3},{6,1,4}};
        maximumDetonation(bombs);
    }
    static class Pair{
        int x1,y1,x2,y2;

        Pair(int i,int j,int k,int l){
            x1=i;
            x2=j;
            y1=k;
            y2=l;
        }
    }
    public static int maximumDetonation(int[][] bombs) {
        int m=bombs.length;
        int res=0,ans=0;
        Pair pair[]=new Pair[m];
        for (int i = 0; i < m; i++) {
            
            int x=bombs[i][0];
            int y=bombs[i][1];
            int r=bombs[i][2];
            pair[i]=new Pair(x-r,x+r,y-r,y+r);
            
        }
        for (Pair pair2 : pair) {
            System.out.println(pair2.x1+" "+pair2.x2+" "+pair2.y1+" "+pair2.y2);
        }

        int px1,px2,py1,py2;
        int x1,x2,y1,y2;
        for (int i = 0; i < m; i++) {
             px1=pair[i].x1;
             px2=pair[i].x2;
             py1=pair[i].y1;
             py2 =pair[i].y2;
             ans=1;
            for (int j = 0; j < m; j++) {
                
                x1=pair[j].x1;
                x2=pair[j].x2;
                y1=pair[j].y1;
                y2 =pair[j].y2;
                
                if(px1<x1 && px2>x1 && py1<y2 && py2>y1){
                    ans++;
                }
            }

            if(ans>res) res=ans;
            
        }

        System.out.println(res);

        return res;
    }
}
