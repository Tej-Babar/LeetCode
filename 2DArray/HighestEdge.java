public class HighestEdge {
    public static void main(String[] args) {
        int[] edges={3,3,3,0};
        System.out.println(edgeScore(edges));
    }

    public static int edgeScore(int[] edges) {
        int n=edges.length;
        int index=n-1;

        
        int max=0;
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            int point=edges[i];
            ans[point]+=i;

            if (ans[point]==max) {
                
                index=Math.min(index, point);
            }
            else if (ans[point]>max) {
                max=ans[point];
                index=point;
            }
        }

       
        return index;
    }
}
