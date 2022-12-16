import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int sum = 0;

        for (int i = 0;i < elements; i++){
            int number = scanner.nextInt();
            if(number % 6 == 0){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}