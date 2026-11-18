
import java.util.Scanner;

public class Q08_Shopping_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Shopping Amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. Premium");
        System.out.println("2. Regular");
        System.out.println("3. Non-Member");
        System.out.print("Enter Membership Type: ");
        int type = sc.nextInt();

        double rate = 0;

        if (amount < 0) {
            System.out.println("Invalid Shopping Amount");
        } else {
            if (type == 1) {
                if (amount >= 5000) {
                    rate = 25;
                } else {
                    rate = 20;
                }
            } else if (type == 2) {
                if (amount >= 5000) {
                    rate = 15;
                } else {
                    rate = 10;
                }
            } else if (type == 3) {
                if (amount >= 5000) {
                    rate = 5;
                }
            } else {
                System.out.println("Invalid Membership Type");
                sc.close();
                return;
            }

            double discount = amount * rate / 100;
            double finalAmount = amount - discount;

            System.out.println("Discount: Rs." + discount);
            System.out.println("Final Amount: Rs." + finalAmount);
        }

        sc.close();
    }
}
