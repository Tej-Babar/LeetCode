public class Sandwich {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1}, sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
  
        int n=students.length;
        int one=0;
        int zero=0;
        int i=0,j=0;
        while (i<n) {
            if(students[i]==sandwiches[j]){
               j++;
            }
            else if(students[i]==1) one++;
            else zero++;

            i++;
        }
      
        while (j<n) {
            if(sandwiches[j]==1 && one>0){
             j++;
             one--;
            }
                
            else if(sandwiches[j]==0 && zero>0){
                 j++;
                 zero--;
            }
            else break;
        }

        return n-j;
    }

}
