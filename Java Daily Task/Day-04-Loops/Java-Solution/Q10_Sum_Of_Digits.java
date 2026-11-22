import java.util.Scanner;

public class Q10_Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;

        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of Digits: " + sum);

        sc.close();
    }
}
