package maxslice.maxprofit;


public class Solution {
    public int solution(int[] A) {
        int min_price = 200000;
        int max_profit = 0;
        for(int i=0;i<A.length;i++) {
            min_price = Math.min(min_price, A[i]);
            max_profit = Math.max(A[i]-min_price, max_profit);
        }

        return max_profit;
    }
}
