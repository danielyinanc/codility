package stacksandqueues.nesting;

import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.solution("(()(())())"));
        System.out.println(sol.solution("())"));
        System.out.println(sol.solution("()(()()(((()())(()()))"));

    }
    public int solution(String S) {
        Stack<Character> characterStack = new Stack<>();
        if(S.length() ==0)
            return 1;
        for(int i=0;i<S.length();i++){
            char current = S.charAt(i);
            if(current=='(')
                characterStack.push(current);
            if(current == ')') {
                if(characterStack.isEmpty())
                    return 0;
                char last = characterStack.peek();
                if(last == '(')
                    characterStack.pop();
            }
        }

        return characterStack.isEmpty()?1:0;
    }
}