package stacksandqueues.brackets;


import java.util.Stack;

public class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> characterStack = new Stack<>();
        for(int i =0; i<S.length();i++){
            char current = S.charAt(i);
            if (current == '{' || current == '(' || current =='[') {
                characterStack.push(current);
            }

            if(current=='}' || current == ')' || current == ']'){
                if(characterStack.empty())
                    return 0;
                char last = characterStack.peek();
                if(current=='}' && last=='{' || current==')' && last=='(' || current==']' && last=='[') {
                    characterStack.pop();
                }
            }
        }

        return characterStack.isEmpty()?1:0;
    }
}
