import java.util.Scanner;

public class Q07_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not possible for negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}
