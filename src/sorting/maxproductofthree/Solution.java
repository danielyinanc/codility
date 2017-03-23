package sorting.maxproductofthree;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        int incr=0;
        int counter=0;
        for(int i=0; i<A.length;i++){
            if(i+1 < A.length)
                if(A[i+1]-A[i] > incr){
                    incr = A[i+1]-A[i];
                    counter++;
                }
            if(counter == 2)
                return 1;
        }

        return 0;
    }
}
