package indeedprime2016.rectanglebuildergreaterarea;

import java.util.*;

/*
Halfling Woolly Proudhoof is an eminent sheep herder. He wants to build a pen (enclosure) for his new flock of sheep. The pen will be rectangular and built from exactly four pieces of fence (so, the pieces of fence forming the opposite sides of the pen must be of equal length). Woolly can choose these pieces out of N pieces of fence that are stored in his barn. To hold the entire flock, the area of the pen must be greater than or equal to a given threshold X.

Woolly is interested in the number of different ways in which he can build a pen. Pens are considered different if the sets of lengths of their sides are different. For example, a pen of size 1×4 is different from a pen of size 2×2 (although both have an area of 4), but pens of sizes 1×2 and 2×1 are considered the same.

Write a function:

class Solution { public int solution(int[] A, int X); }

that, given a zero-indexed array A of N integers (containing the lengths of the available pieces of fence) and an integer X, returns the number of different ways of building a rectangular pen satisfying the above conditions. The function should return −1 if the result exceeds 1,000,000,000.

For example, given X = 5 and the following array A:

  A[0] = 1
  A[1] = 2
  A[2] = 5
  A[3] = 1
  A[4] = 1
  A[5] = 2
  A[6] = 3
  A[7] = 5
  A[8] = 1


the function should return 2. The figure above shows available pieces of fence (on the left) and possible to build pens (on the right). The pens are of sizes 1x5 and 2x5. Pens of sizes 1×1 and 1×2 can be built, but are too small in area. It is not possible to build pens of sizes 2×3 or 3×5, as there is only one piece of fence of length 3.

Assume that:

N is an integer within the range [0..100,000];
X is an integer within the range [1..1,000,000,000];
each element of array A is an integer within the range [1..1,000,000,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

PseudoCode:

Set total permutations to zero
while counter i is less than Array size
    set Array member of interest
    while counter is less than Array size and more than counter i
        check if Array member has a duplicate (check 1)
        check if Another array member if multiplied greater than or equal to X (check 2)
        check if that area is claimed for that size
        if both
 */
public class Solution {
    public static void main(String[] args) {
        int[] A = {1,2,5,1,1,2,3,5,1};
        Solution sol = new Solution();
        System.out.println(sol.solution(A,5));
    }
    public int solution(int[] A, int X) {
        TreeMap<Integer, Integer> sideMap = new TreeMap<>();
        Set<Rectangle> rectangles = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (sideMap.containsKey(A[i])) {
                sideMap.put(A[i], sideMap.get(A[i]) + 1);
            } else {
                sideMap.put(A[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : sideMap.entrySet()) {
            if (entry.getValue() >= 2)
                for (Map.Entry<Integer, Integer> entry2 : sideMap.entrySet()) {
                    if ((!entry.getKey().equals(entry2.getKey()) && entry2.getValue() >= 2) ||
                            (entry.getKey().equals(entry2.getKey()) && entry2.getValue() >= 4)) {
                        if(entry.getKey() * entry2.getKey() >= X) {
                            Rectangle rect = new Rectangle(entry.getKey(), entry2.getKey());
                            rectangles.add(rect);
                        }

                    }
                }
        }
        // write your code in Java SE 8
        return rectangles.size();
    }

    public static class Rectangle {
        private int x;
        private int y;

        Rectangle(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x+ y);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Rectangle)) {
                return false;
            }
            Rectangle rect = (Rectangle) obj;
            return (rect.x == this.x && rect.y == this.y) || (rect.y == this.x && rect.x == this.y);
        }
    }
}
