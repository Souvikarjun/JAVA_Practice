public class arithmatic {
    public static void main(String args[]) {

        int a = 10;
        int b = 5;

        System.out.println("\nArithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operations:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nLogical Operations:");
        System.out.println("(a > 0) && (b > 0): " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0): " + ((a > 0) || (b > 0)));
        System.out.println("!(a > b): " + !(a > b));
    }
}
