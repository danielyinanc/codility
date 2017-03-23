package timecomplexity.frogjmpr;


public class Solution {
    public int solution(int X, int Y, int D){
        int distance = Y-X;
        float dFlt = (float) D;
        float timesJump = distance/dFlt;
        int intPart = (int) timesJump;
        float fltPart = timesJump - intPart;

        if(fltPart > 0.00)
            intPart = intPart + 1;
        return intPart;
    };
}
