import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long m = scanner.nextLong();
        Long factorial  = 0L;
        int n = 0;

        while (factorial <= m){

            if (n == 0){
                factorial = 1L;
            }else{
                factorial = n * factorial;
            }
            n++;
        }
        System.out.print(--n);




    }
}