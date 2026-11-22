import java.util.Scanner;

public class Q08_Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int count = 0;

        num = Math.abs(num);

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Number of Digits: " + count);

        sc.close();
    }
}
