
import java.util.Scanner;

public class Q03_Water_Usage_Charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Water Units Used: ");
        int units = sc.nextInt();

        double bill;

        if (units < 0) {
            System.out.println("Invalid Water Units");
        } else if (units <= 100) {
            bill = units * 5;
            System.out.println("Total Water Bill: Rs." + bill);
        } else if (units <= 200) {
            bill = units * 7;
            System.out.println("Total Water Bill: Rs." + bill);
        } else {
            bill = units * 10;
            System.out.println("Total Water Bill: Rs." + bill);
        }

        sc.close();
    }
}
