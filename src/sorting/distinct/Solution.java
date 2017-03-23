package sorting.distinct;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        Set<Integer> integerSet = new HashSet<>();
        return (int) Arrays.stream(A).filter(n->integerSet.add(n)).count();
    }
}