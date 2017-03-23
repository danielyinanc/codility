package prefixsums.countdiv;


public class Solution {
    public int solution(int A, int B, int K){
        int a = A/K + 1;
        int b = B/K + 1;
        // O(A+B) soln below
        //return ((int) IntStream.range(A, B + 1).filter(n -> n % K == 0).count());
        if(A%K==0)
            --a;
        return b-a;
    }
}
