package timecomplexity.tapeequilibrium;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A){
        int p = 0;

        int sum = Arrays.stream(A).sum();
        int sumOfLeft = 0;
        int minDifference = Integer.MAX_VALUE;
        int minPoint = 0;
        for(int i=1; i<A.length; i++) {
            sum -= A[i-1];
            sumOfLeft += A[i-1];
            int subArrSum = Arrays.stream(Arrays.copyOfRange(A, i, A.length)).sum();
            if(minDifference >  Math.abs(sum - subArrSum)) {
                minDifference = Math.abs(sum - subArrSum);
                minPoint = i;
            }
        }

        return minPoint;
    };
}