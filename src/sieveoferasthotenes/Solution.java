package sieveoferasthotenes;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        PrimeSieve pr = new PrimeSieve();
        //System.out.println(pr.sievePrimes(15));
        System.out.println(pr.semiPrimeCount(pr.sievePrimes(10/2),4,10));
        System.out.println(pr.semiPrimeCount(pr.sievePrimes(26/2+1),1,26));
        System.out.println(pr.semiPrimeCount(pr.sievePrimes(20/2+1),16,20));

    }

    public int[] solution(int N, int[] P, int[] Q) {
        boolean[] sieve = sievePrimes(N/2+1);
        int[] retArr = new int[P.length];
        for(int i =0; i<P.length;i++){
            retArr[i] = semiPrimeCount(sieve, P[i], Q[i]);
        }

        return retArr;
        // write your code in Java SE 8
    }

    public boolean[] sievePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor * factor <= n; factor++) {
            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }


        return isPrime;
    }

    public int[] primeArr(boolean[] primeSieve){
        List<Integer> retList = new ArrayList<>();
        for(int i=0; i<primeSieve.length;i++){
            if(primeSieve[i])
                retList.add(i);
        }

        return retList.stream().mapToInt(i->i).toArray();
    }

    public int semiPrimeCount(boolean[] primeSieve, int start, int end) {
        int retCount = 0;
        int[] arrToUse = primeArr(primeSieve);
        for (int i = 0; i < arrToUse.length; i++) {
            for (int j = i; j < arrToUse.length; j++) {
                if ( arrToUse[i] * arrToUse[j] >= start && arrToUse[i] * arrToUse[j] <= end )
                    retCount++;
            }
        }

        return retCount;
    }
}
