package leader.dominator;

import java.util.Stack;

public class Solution {
    public int solution(int[] A) {
        Stack<Integer> intStack = new Stack<>();
        for(int i=0; i<A.length;i++){
            if(intStack.isEmpty()) {
                intStack.push(A[i]);
            } else {
                if(A[i] != intStack.peek()) {
                    intStack.pop();
                } else {
                    intStack.push(A[i]);
                }
            }
        }

        int candidate = Integer.MIN_VALUE;
        int count = 0;
        int leader = -1;
        int leaderIndex = -1;
        if(!intStack.isEmpty())
            candidate = intStack.peek();

        for(int i=0;i<A.length;i++) {
            if(A[i] == candidate)
                count++;
            if(count > A.length/2){
                leaderIndex = i;
                break;
            }

        }

        return leaderIndex;
        // write your code in Java SE 8
    }
}