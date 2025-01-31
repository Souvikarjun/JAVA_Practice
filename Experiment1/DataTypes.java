public class DataTypes {

        public static void main(String[] args) {
        System.out.println("Primitive Data Types in Java:\n");

        System.out.println("Data Type: byte");
        System.out.println("Default Value: " + 0);
        System.out.println("Size: " + Byte.BYTES + " bytes");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: short");
        System.out.println("Default Value: " + 0);
        System.out.println("Size: " + Short.BYTES + " bytes");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: int");
        System.out.println("Default Value: " + 0);
        System.out.println("Size: " + Integer.BYTES + " bytes");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: long");
        System.out.println("Default Value: " + 0L);
        System.out.println("Size: " + Long.BYTES + " bytes");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: float");
        System.out.println("Default Value: " + 0.0f);
        System.out.println("Size: " + Float.BYTES + " bytes");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: double");
        System.out.println("Default Value: " + 0.0d);
        System.out.println("Size: " + Double.BYTES + " bytes");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: char");
        System.out.println("Default Value: " + '\u0000');
        System.out.println("Size: " + Character.BYTES + " bytes");
        System.out.println("Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: boolean");
        System.out.println("Default Value: " + false);
        System.out.println("Size: 1 bit (implementation-dependent)");
        System.out.println("Range: " + "true/false");
    }
}
