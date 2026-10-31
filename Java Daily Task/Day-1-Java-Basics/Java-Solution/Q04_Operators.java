public class Q04_Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        System.out.println("Logical AND: " + (a > 10 && b < 20));
        System.out.println("Logical OR: " + (a < 10 || b < 20));

        // Assignment Operator
        a += 5;
        System.out.println("After a += 5: " + a);

        // Unary Operator
        b++;
        System.out.println("After b++: " + b);
    }
}