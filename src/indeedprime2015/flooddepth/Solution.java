package indeedprime2015.flooddepth;
/*
Pseudo-Code
- set max and sum to zero
- Go through the array
    - Find a max
    - While looking another local max
        - sum difference between first max and level of lake
        - count number of levels passed
        - if next local max is greater -> add to sum
        - if next local max is lesser than max -> subtract difference * levels from total water before
        adding to sum
         A[0] = 1
    A[1] = 3
    A[2] = 2
    A[3] = 1
    A[4] = 2
    A[5] = 1
    A[6] = 5
    A[7] = 3
    A[8] = 3
    A[9] = 4
    A[10] = 2
 */
class Solution {
    public static void main(String[] args) {
        int[] A = {1,3,2,1,2,1,5,3,3,4,2};
        int[] B = {5,8};
        int[] C = {Integer.MIN_VALUE};
        int[] D = {Integer.MAX_VALUE};
        int[] E = {1,3,1};
        int[] F = {4,2,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.solution(A));
        System.out.println(solution.solution(B));
        System.out.println(solution.solution(C));
        System.out.println(solution.solution(D));
        System.out.println(solution.solution(E));
        System.out.println(solution.solution(F));
    }
    public int solution(int[] A) {
        int peak = 0;
        int peakIndex = 0;
        int depthMax = 0;
        int realDepthMax = 0;
        int sum = 0;
        int localPeak = 0;
        int localPeakIndex = 0;
        int slope = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] > peak) {
                peak = A[i];
                localPeak = 0;
                peakIndex = i;
                realDepthMax = depthMax;
            } else if(A[i] > localPeak) {
                localPeak = A[i];
                localPeakIndex = i;
            }
            if(depthMax < peak-A[i])
                depthMax = peak - A[i];
            if(i== A.length-1 && localPeak != 0){
                depthMax = 0;
                for(int j = peakIndex+1; j <localPeakIndex; j++) {
                    if(depthMax < localPeak - A[j])
                        depthMax = localPeak - A[j];
                }

                if(realDepthMax < depthMax)
                    realDepthMax = depthMax;

            }

        }
        return realDepthMax;
    }
}
