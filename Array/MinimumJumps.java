public class MinimumJumps {
    public static void main(String[] args) {
        
    }

    static int minJumps(int[] nums){
        int i = 0;
        int n=nums.length;
        for (int reach = 0; i < n && i <= reach; ++i)
            reach = Math.max(i+nums[i],reach);
    
    
        if(i != n)  return -1;
        
         
           int jumps = 0, currentJumpEnd = 0, farthest = 0;
            for (int j = 0; j < n-1 ; j++) {
               
                 farthest = Math.max(farthest, j + nums[j]);
                 if (j == currentJumpEnd) {
                     
                    
                    jumps++;
                    currentJumpEnd = farthest;
                  
                }
               
            }
            return jumps;
        }
    }