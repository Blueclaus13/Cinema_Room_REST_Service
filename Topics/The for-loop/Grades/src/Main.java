import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alumns = scanner.nextInt();

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;

        for (int i= 0; i < alumns; i++){
            String grade = scanner.next();
            if(grade.equalsIgnoreCase("A")){
                sumA++;
            } else if (grade.equalsIgnoreCase("B")) {
                sumB++;
            }else if (grade.equalsIgnoreCase("C")) {
                sumC++;
            }else{
                sumD++;
            }

        }

        String result = sumD + " " + sumC + " " +
                sumB + " " + sumA;

        System.out.println(result);



    }
}