package timecomplexity.permmissingelem;


import java.util.Arrays;

public class Solution {
    /*
    Algorithm:
        Load all integers into a Set
        check for all values if they exist in the set.
        sort Array.
        check if any value is greater than one from its predecessor.
     */
    public int solution(int[] A){
        if(A.length == 0)
            return 1;
        Arrays.sort(A);
        if(A[0] != 1)
            return 1;
        if(A[A.length-1] != A.length)
            return A.length;

        for(int i =0; i< A.length - 1; i++){
            if(A[i+1] - A[i] > 1) {
                return A[i] + 1;
            }
        }



        return 0;
    };

}