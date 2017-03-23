package globeandmail.task3;


class Solution {
    public static void main(String[] args) {
        int[] A = {1,3,-3};
        int[] B = {4,3,2,5,1,1};

        Solution sol = new Solution();
        System.out.println(sol.solution(A));
        System.out.println(sol.solution(B));
    }
    public int solution(int[] A) {
        int max_left = A[0];
        int max_abs_diff = 0;
        int max_index = 0;
        for(int i = 1; i<A.length;i++){
            max_left = Math.max(A[i], max_left);
            int max_right = Integer.MIN_VALUE;
            for(int j=i; j<A.length;j++) {
                max_right = Math.max(A[j], max_right);
            }

            if(max_abs_diff < Math.abs(max_left - max_right)) {
                max_abs_diff = Math.abs(max_left - max_right);
            }
        }

        return max_abs_diff;
    }
}
