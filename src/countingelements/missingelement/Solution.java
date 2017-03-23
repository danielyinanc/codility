package countingelements.missingelement;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A){
        Set<Integer> intSet = Arrays.stream(A).filter(n-> n>0).sorted().boxed().collect(Collectors.toSet());

        for(int i=1;i<100002;i++){
            if(!intSet.contains(i)){
                return i;
            }
        }

        return -1;
    }
}
