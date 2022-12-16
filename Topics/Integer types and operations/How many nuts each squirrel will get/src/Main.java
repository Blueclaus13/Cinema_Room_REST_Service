import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int ardillas = scanner.nextInt();
        int nuts =  scanner.nextInt();

         int porsionOfNuts= nuts / ardillas;

        System.out.println(porsionOfNuts);
    }
}
