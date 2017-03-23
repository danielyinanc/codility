package iterations.binarygap;

public class Solution {
    public int solution(int N) {
        String binaryIntInStr = Integer.toBinaryString(N);
        if(N <1 || N >2147483647)
            throw new ArithmeticException();
        int firstILoc = -1;
        int lastILoc = -1;
        int maxLength = 0;
        for(int i = 0; i< binaryIntInStr.length();i++){
            if(binaryIntInStr.charAt(i) == '1') {
                if(firstILoc == -1) {
                    firstILoc = i;
                } else {
                    lastILoc = i;
                    if((lastILoc - firstILoc - 1) > maxLength)
                        maxLength = lastILoc - firstILoc - 1;
                    firstILoc = i;
                    lastILoc = -1;
                }

            }
        }

        return maxLength;

    }
}
