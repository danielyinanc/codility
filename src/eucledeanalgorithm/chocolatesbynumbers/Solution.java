package eucledeanalgorithm.chocolatesbynumbers;


public class Solution {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.solution(10,4));
    }
    public int solution(int N, int M){
        boolean[] B = new boolean[N];
        int i=0;
        int count=0;
        while(!B[i]){
            B[i] = true;
            i= (i+M) %N;
            if(i>=N)
                i=N-1;
            count++;
        }

        return count;
    }
}
