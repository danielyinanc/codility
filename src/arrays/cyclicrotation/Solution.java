package arrays.cyclicrotation;



public class Solution {
    public int[] solution(int[] A, int K){
        K= K%A.length;
        if(A.length == 0 || A.length == 1 || K == 0)
            return A;

        int[] B = new int[A.length];
/*        int j = 0;
        for(int i = K-1; i< A.length; i++ ) {
            B[j] = A[i];
            j++;
        }
        int t = 0;
        for(int k = j; k<B.length; k++) {
            B[k] = A[t];
            t++;
        }*/

        System.arraycopy(A, K - 1, B, 0, A.length -K + 1);
        System.arraycopy(A, 0, B, A.length-K + 1, K-1);
        return B;
    }
}
