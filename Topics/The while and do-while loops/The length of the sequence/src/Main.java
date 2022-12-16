import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.nextInt() > 0){
            ++sum;
        }
        System.out.print(sum);
    }
}