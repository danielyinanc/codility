package algorithms.recursive.powerofsum;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(recursionPower(i,j));
    }

    private static int recursionPower(int value, int powerN) {
        if(value == 0)
            return 1;
        int a = (int) Math.pow(value, 1.d/powerN);
        return 1+ recursionPower(value-a^powerN, powerN);
    }
}
