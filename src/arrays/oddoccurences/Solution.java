package arrays.oddoccurences;

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int solution(int[] A) {
        /*
                N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.


         */
        Set<Integer> oddCountMap = new HashSet<>();
        if (A.length < 1 || A.length > 1000000)
            throw new ArithmeticException();

        for (int i : A) {
            if (i < 1 || i > 1000000000 || i % 2 == 0)
                throw new ArithmeticException();

            if (oddCountMap.contains(i)) {
                oddCountMap.remove(i);
            } else {
                oddCountMap.add(i);
            }
        }
        Integer[] intArr = new Integer[1];
        oddCountMap.toArray(intArr);

        return intArr[0];
    }
}