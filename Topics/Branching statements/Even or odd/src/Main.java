import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true){
            number = scanner.nextInt();
            if(number ==0){
                break;
            }
            if(number % 2 == 0 ){
                System.out.println("even");
            }else{System.out.println("odd");}

        }
    }
}