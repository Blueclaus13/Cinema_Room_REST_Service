import java.util.Scanner;

class NumbersFilter extends Thread {

    /* use it to read numbers from the standard input */
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        int input = scanner.nextInt();
        while (input != 0){
            if (input % 2 == 0){
                System.out.println(input);
            }
            input = scanner.nextInt();
        }
    }
}