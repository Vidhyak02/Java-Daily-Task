
import java.util.Scanner;

public class Q07_Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();

        double rate;

        if (salary < 0 || experience < 0) {
            System.out.println("Invalid Input");
        } else {
            if (experience >= 10) {
                rate = 20;
            } else if (experience >= 5) {
                rate = 15;
            } else if (experience >= 2) {
                rate = 10;
            } else {
                rate = 5;
            }

            double bonus = salary * rate / 100;
            double finalSalary = salary + bonus;

            System.out.println("Salary: Rs." + salary);
            System.out.println("Bonus: Rs." + bonus);
            System.out.println("Final Salary: Rs." + finalSalary);
        }

        sc.close();
    }
}
