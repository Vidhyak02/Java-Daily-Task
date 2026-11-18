
import java.util.Scanner;

public class Q02_ECommerce_Delivery_Charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order Amount: ");
        double amount = sc.nextDouble();

        double deliveryCharge;

        if (amount < 0) {
            System.out.println("Invalid Order Amount");
        } else {
            if (amount >= 2000) {
                deliveryCharge = 0;
            } else if (amount >= 1000) {
                deliveryCharge = 50;
            } else {
                deliveryCharge = 100;
            }

            double finalAmount = amount + deliveryCharge;

            System.out.println("Order Amount: Rs." + amount);
            System.out.println("Delivery Charge: Rs." + deliveryCharge);
            System.out.println("Final Amount: Rs." + finalAmount);
        }

        sc.close();
    }
}
