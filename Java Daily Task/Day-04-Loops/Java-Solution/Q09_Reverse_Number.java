import java.util.Scanner;

public class Q09_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int original = num;

        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original < 0) {
            reverse = -reverse;
        }

        System.out.println("Reverse Number: " + reverse);

        sc.close();
    }
}
