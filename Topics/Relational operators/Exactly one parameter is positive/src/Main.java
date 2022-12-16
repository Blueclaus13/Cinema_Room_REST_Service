import java.util.Scanner;

class Main {

    public static boolean greather(int check, int y, int z) {

        boolean result = check > 0 && y <= 0 && z <= 0;
        return result;
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean comparation1 = greather(x,y,z);
        boolean comparation2= greather(y,x,z);
        boolean comparation3 = greather(z,y,x);

        boolean result = comparation1 || comparation2 || comparation3;

        System.out.println(result);
    }


}