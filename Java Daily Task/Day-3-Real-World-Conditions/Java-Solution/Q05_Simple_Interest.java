
import java.util.Scanner;

public class Q05_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time in Years: ");
        double time = sc.nextDouble();

        System.out.println("1. Student");
        System.out.println("2. General");
        System.out.print("Enter Customer Type: ");
        int type = sc.nextInt();

        double rate;

        if (principal < 0 || time < 0) {
            System.out.println("Invalid Amount or Time");
        } else if (type == 1) {
            rate = 5;
            double interest = (principal * rate * time) / 100;
            double total = principal + interest;

            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Simple Interest: Rs." + interest);
            System.out.println("Total Amount: Rs." + total);

        } else if (type == 2) {
            rate = 7;
            double interest = (principal * rate * time) / 100;
            double total = principal + interest;

            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Simple Interest: Rs." + interest);
            System.out.println("Total Amount: Rs." + total);
        } else {
            System.out.println("Invalid Customer Type");
        }

        sc.close();
    }
}
