package primeandcompositenumbers.countfactors;


public class Solution {
    public int solution(int N) {
        int i = 1;
        int result = 0;
        while(i*i < N) {
            if(N % i ==0) {
                result +=2;
            }
            i++;
        }

        if(i*i == N)
            result++;
        // write your code in Java SE 8

        return result;
    }
}
