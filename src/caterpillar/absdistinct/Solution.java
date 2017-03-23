package caterpillar.absdistinct;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> integerSet = new HashSet<>();
        for(int value: A) {
            integerSet.add(Math.abs(value));
        }
        // write your code in Java SE 8

        return integerSet.size();
    }
}