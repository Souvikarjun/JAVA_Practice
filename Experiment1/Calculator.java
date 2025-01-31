class Number {
    private double num1;
    private double num2;

    public Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {

        Number number = new Number(10, 5);

	System.out.println("Result of addition: " + number.add());

        System.out.println("Result of subtraction: " + number.subtract());

        System.out.println("Result of multiplication: " + number.multiply());

        System.out.println("Result of division: " + number.divide());
    }
}
