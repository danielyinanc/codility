package countingelements.permcheck;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Solution {
    public int solution(int[] A) {

        Set<Integer> setA = Arrays.stream(A).boxed().collect(Collectors.toSet());
        if(setA.size() == A.length && Arrays.stream(A).sum() == (A.length *(A.length+1))/2)
            return 1;
        return 0;
    };
}
