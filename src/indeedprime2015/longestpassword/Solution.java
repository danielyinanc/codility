package indeedprime2015.longestpassword;

/*
Find max length password and return their length
- Split String into password substrings
- Test each substring for
    - containing only alphanumeric characters
    - contains even number of letters
    - contains odd number of digits
 */
public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution( "test 5 a0A pass007 ?xy1"));
    }

    public int solution(String S) {
        // write your code in Java SE 8
        String[] words = S.split(" ");
        int maxLength = -1;
        for(String password: words) {
            if(passwordEvaluate(password) && password.length() > maxLength)
                maxLength = password.length();
        }

        return maxLength;
    }

    private boolean passwordEvaluate(String pwd) {
        int letCount = 0;
        int digCount = 0;
        if(!pwd.matches("^[a-zA-Z0-9]*$"))
            return false;
        for(char c: pwd.toCharArray()) {
            if(Character.isLetter(c))
                letCount++;
            if(Character.isDigit(c))
                digCount++;
        }

        return letCount % 2 == 0 && digCount % 2 !=0;
    }
}
