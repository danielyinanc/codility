package countingelements.maxcounters;


import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] A){
        int[] newArr = new int[N];
        int maxVal= 0;
        for(int i =0;i<A.length;i++){
            if(A[i]<=N) {
                if((newArr[A[i]-1] +1) > maxVal)
                    maxVal = newArr[A[i]-1] +1;
                newArr[A[i]-1] = newArr[A[i]-1] +1;

            } else {
                Arrays.fill(newArr, maxVal);
            }
        }

        return newArr;
    }
}