package countingelements.frogriverone;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution {
public int solution(int X, int[] A) {
        Set<Integer> integerSet = IntStream.range(1, X+1).boxed().collect(Collectors.toSet());
        Set<Integer> colSet = new HashSet<>();
        int counter = -1;
        for(int i = 0; i< A.length; i++){
            if(integerSet.contains(A[i]))
                colSet.add(A[i]);
            if(colSet.size() == integerSet.size()){
                counter = i;
                break;
            }

        }
        // write your code in Java SE 8
        return counter;
    }
}