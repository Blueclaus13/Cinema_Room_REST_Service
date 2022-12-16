import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ah = scanner.nextInt();
        int am = scanner.nextInt();
        int as = scanner.nextInt();
        int bh = scanner.nextInt();
        int bm = scanner.nextInt();
        int bs = scanner.nextInt();

        int m1 = (ah * 60) + am;
        int s1 = (m1 * 60) + as ;

        int m2 = (bh * 60) + bm;
        int s2 = (m2 * 60) + bs;

        int result = s2 - s1;

        System.out.println(result);


    }
}