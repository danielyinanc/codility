package demoq;

public class Solution {
    public static void main(String[] args) {
        int[] A = {-1,3,-4,5,1,-6,2,1};
        int[] B = {1,2,3,1,2};
        int[] C = {0,0,0,0,0};
        int[] D = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, -Integer.MIN_VALUE};
        Solution sol = new Solution();
        System.out.println(sol.solution(A));
        System.out.println(sol.solution(B));
        System.out.println(sol.solution(C));
        System.out.println(sol.solution(D));
    }
    public int solution(int[] A) {
        int s = 0;
        int front = 0;
        int sumTotal = 0;
        int[] sumTotals = new int[A.length];
        for(int i=0;i<A.length;i++) {
            sumTotal = sumTotal +A[i];
            int frontSumTotal = 0;
            for(int j=i+2;j<A.length;j++) {
                frontSumTotal += A[j];
            }
            if(sumTotal == frontSumTotal)
                return i+1;
        }

        return -1;
    }
}
