package prefixsums.passingcars;


public class Solution {
    public int solution(int[] A) {
        int eastAccum = 0;
        int westAccum = 0;
        for(int i = 0; i<A.length; i++) {
            if(A[i] == 0){
                eastAccum++;
            } else {
                westAccum += eastAccum;
            }
        }
        if(westAccum >  1000000000)
            westAccum = -1;
        return westAccum;
    }
}
