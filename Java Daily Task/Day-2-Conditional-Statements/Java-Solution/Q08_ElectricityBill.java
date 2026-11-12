import java.util.Scanner;

public class Q08_ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();

        double bill;
        double surcharge;
        double totalBill;

        if (units < 0) {
            System.out.println("Invalid Units");
        }
        else {
            if (units <= 100) {
                bill = units * 5;
            }
            else if (units <= 200) {
                bill = units * 6;
            }
            else {
                bill = units * 8;
            }

            surcharge = bill * 0.10;
            totalBill = bill + surcharge;

            System.out.println("Electricity Bill: Rs." + bill);
            System.out.println("Surcharge (10%): Rs." + surcharge);
            System.out.println("Total Bill: Rs." + totalBill);
        }

        sc.close();
    }
}