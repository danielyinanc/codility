package stacksandqueues.fish;

import java.util.Stack;

public class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> fishStack = new Stack<>();


        int duels=0;
        for(int i=0;i<A.length;i++){
            if(B[i] == 0) {
                while(!fishStack.isEmpty()) {
                    duels++;
                    if(A[i] < fishStack.peek())
                        break;
                    fishStack.pop();
                }
            } else
                fishStack.push(A[i]);

        }

        return A.length - duels;
    }
}