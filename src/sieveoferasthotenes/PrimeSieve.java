package sieveoferasthotenes;

import java.util.ArrayList;
import java.util.List;

/*
   Return list of primes using sieve of Erasthotenes
   - Create a boolean array assuming all but 0 and 1 are primes
   - Mark primes by using prime factorization multiples method
   - Use boolean array to filter array of int for return
 */
public class PrimeSieve {
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


    public int[] semiPrimeSet(boolean[] primeSieve){
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

