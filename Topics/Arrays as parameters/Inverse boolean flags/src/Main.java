import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void inverseFlags(boolean [] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = !flags[i];

        }
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); // 1
        final int a;                                 // 2
        final int b = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
        c = b;                                          // 5
        System.out.println(c + 1);
    }
}