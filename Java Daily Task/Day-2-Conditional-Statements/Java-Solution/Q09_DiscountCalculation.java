import java.util.Scanner;

public class Q09_DiscountCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double discount;
        double discountAmount;
        double finalAmount;

        if (amount < 0) {
            System.out.println("Invalid Amount");
        }
        else {
            if (amount >= 5000) {
                discount = 20;
            }
            else if (amount >= 3000) {
                discount = 15;
            }
            else if (amount >= 1000) {
                discount = 10;
            }
            else {
                discount = 0;
            }

            discountAmount = amount * discount / 100;
            finalAmount = amount - discountAmount;

            System.out.println("Purchase Amount: Rs." + amount);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discount Amount: Rs." + discountAmount);
            System.out.println("Final Amount: Rs." + finalAmount);
        }

        sc.close();
    }
}