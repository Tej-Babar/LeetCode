/*
 * You are given N number of books. Every ith book has Ai number of pages.
 *  The books are arranged in ascending order.

You have to allocate contiguous books to M number of students.
 There can be many ways or permutations to do so. In each permutation,
  one of the M students will be allocated the maximum number of pages.
   Out of all these permutations, the task is to find that particular permutation
    in which the maximum number of pages allocated to a student is the minimum of those
     in all the other permutations and print this minimum value.

Each book will be allocated to exactly one student.
 Each student has to be allocated at least one book.

Note: Return -1 if a valid assignment is not possible,
 and allotment should be in contiguous order (see the explanation for better understanding).

Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:{12} and {34, 67, 90} 
Maximum Pages = 191{12, 34} and {67, 90} 
Maximum Pages = 157{12, 34, 67} and {90} 
Maximum Pages =113. Therefore, the minimum 
of these cases is 113, which is selected 
as the output.
 */

public class AllocateMinPage_97 {
    public static void main(String[] args) {
        int[] A={12,34,67,90};
        int N=A.length;
        int M=2;
        System.out.println(findPages(A, N, M));
    }
    public static int findPages(int[]A,int N,int M)
    { if (N<M) {
        return -1;
    }
   int res=0;
    int max=A[0],min=A[0];
    for (int i = 1; i < N; i++) {
        if (min<A[i]) {
            min=A[i];
        }
        max+=A[i];
    }
   

    while (min<=max) {
        int mid=(min+max)/2;
        if(isValid(A,N,M,mid)){
         res=mid;
         max=mid-1;
        }
        else
        min=mid+1;
            
    }


    return res;
}
private static boolean isValid(int[] a, int n, int m, int mid) {
    int temp=0;
    int k=1;
    for (int i = 0; i <n; i++) {
        if (temp+a[i]>mid) {
            k++;
            temp=a[i];
        }
        else{
            temp+=a[i];
            
        }
    }

    return k<=m;
}
}