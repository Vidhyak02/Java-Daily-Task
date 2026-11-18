
import java.util.Scanner;

public class Q09_Parking_Fee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        int fee;

        if (hours < 0) {
            System.out.println("Invalid Parking Hours");
        } else if (hours <= 2) {
            fee = hours * 30;
            System.out.println("Total Parking Fee: Rs." + fee);
        } else if (hours <= 5) {
            fee = (2 * 30) + ((hours - 2) * 20);
            System.out.println("Total Parking Fee: Rs." + fee);
        } else {
            fee = (2 * 30) + (3 * 20) + ((hours - 5) * 10);
            System.out.println("Total Parking Fee: Rs." + fee);
        }

        sc.close();
    }
}
