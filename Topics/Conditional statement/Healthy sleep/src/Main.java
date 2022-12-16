import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        String result= "";

        if (h < a){
            result = "Deficiency";

        } else if (h > b) {
            result = "Excess";

        }else{
            result = "Normal";
        }

        System.out.println(result);

    }
}