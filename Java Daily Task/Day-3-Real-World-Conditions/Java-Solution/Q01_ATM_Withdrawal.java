
import java.util.Scanner;

public class Q01_ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance || balance - amount < 500) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: Rs." + balance);
        }

        sc.close();
    }
}
