package spring;
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner ai = new Scanner(System.in);
        int a = ai.nextInt(); // Number of rows for the upper half

        // Upper half
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = a - 1; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
