import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;


        while (true){
            number = scanner.nextInt();

            if(number == 0){
                break;
            }

            if(sum < 1000){
                sum+= number;
            }


        }
        if (sum >= 1000){
            sum -= 1000;
        }

        System.out.print(sum);


    }
}