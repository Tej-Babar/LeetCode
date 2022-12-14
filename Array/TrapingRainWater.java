public class TrapingRainWater {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int res=0;
        int n=height.length;
        int[] premax=new int[n];
        int[] sufmax=new int[n];
        int max=height[0];
        for (int i = 0; i < n; i++) {
            if (height[i]>max) {
                max=height[i];
            }
            premax[i]=max;
        }
        max=height[n-1];
        for (int i = n-1; i >= 0; i--) {
            if (height[i]>max) {
                max=height[i];
            }
            sufmax[i]=max;
        }

        for (int i = 0; i < n; i++) {
            res+=Math.min(premax[i], sufmax[i])-height[i];
        }


        

        return res;
    }
}
