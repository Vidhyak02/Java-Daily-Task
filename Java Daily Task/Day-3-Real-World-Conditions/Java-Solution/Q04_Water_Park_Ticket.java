
import java.util.Scanner;

public class Q04_Water_Park_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Age: ");
        int age = sc.nextInt();

        int price;

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 5) {
            price = 0;
            System.out.println("Ticket Price: Free");
        } else if (age <= 12) {
            price = 100;
            System.out.println("Ticket Price: Rs." + price);
        } else if (age <= 59) {
            price = 250;
            System.out.println("Ticket Price: Rs." + price);
        } else {
            price = 150;
            System.out.println("Ticket Price: Rs." + price);
        }

        sc.close();
    }
}
