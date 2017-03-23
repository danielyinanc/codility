package globeandmail.task1;


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("We test coders. Give us a try?"));
        System.out.println(sol.solution(""));
    }
    public int solution(String S) {
        // write your code in Java SE 8
        String[] split = S.split("\\!|\\.|\\?");
        int maxWordCount = 0;
        for(String word: split){
            word = word.trim();
            String [] wordCount =word.split("\\s+");
            if(!word.isEmpty() && maxWordCount < wordCount.length)
                maxWordCount = wordCount.length;
        }
        return maxWordCount;
    }
}