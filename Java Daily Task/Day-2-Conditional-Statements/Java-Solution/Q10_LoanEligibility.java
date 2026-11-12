import java.util.Scanner;

public class Q10_LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        if (age < 0 || salary < 0) {
            System.out.println("Invalid Input");
        }
        else if (age >= 21 && salary >= 30000) {
            System.out.println("Loan Eligible");
        }
        else {
            System.out.println("Loan Not Eligible");
        }

        sc.close();
    }
}