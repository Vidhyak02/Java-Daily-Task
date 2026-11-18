
import java.util.Scanner;

public class Q06_Movie_Ticket_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Show Type (NORMAL/IMAX): ");
        String show = sc.next();

        int price = 0;

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 12) {
            price = 120;
            System.out.println("Child Ticket");
        } else if (age <= 59) {
            price = 200;
            System.out.println("Adult Ticket");
        } else {
            price = 150;
            System.out.println("Senior Citizen Ticket");
        }

        if (age >= 0) {
            if (show.equalsIgnoreCase("IMAX")) {
                price = price + 100;
            } else if (!show.equalsIgnoreCase("NORMAL")) {
                System.out.println("Invalid Show Type");
                sc.close();
                return;
            }

            System.out.println("Final Ticket Price: Rs." + price);
        }

        sc.close();
    }
}
