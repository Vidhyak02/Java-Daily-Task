
import java.util.Scanner;

public class Q10_Mobile_Recharge_Plan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        if (amount < 0) {
            System.out.println("Invalid Recharge Amount");
        } else if (amount >= 599) {
            System.out.println("Selected Plan: Unlimited Data + Calls");
        } else if (amount >= 399) {
            System.out.println("Selected Plan: 2GB Data per Day + Calls");
        } else if (amount >= 199) {
            System.out.println("Selected Plan: 1GB Data per Day + Calls");
        } else {
            System.out.println("Selected Plan: Basic Plan");
        }

        sc.close();
    }
}
