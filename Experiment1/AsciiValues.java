public class AsciiValues {
    public static void main(String[] args) {
        System.out.println("ASCII values of numbers (0-9):");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        System.out.println("\nASCII values of uppercase alphabets (A-Z):");
        for (char ch = 'A'; ch <= 'G'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        System.out.println("\nASCII values of lowercase alphabets (a-z):");
        for (char ch = 'a'; ch <= 'g'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        System.out.println("\nASCII values of special characters (! to /):");
        for (char ch = '!'; ch <= '/'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }
    }
}
