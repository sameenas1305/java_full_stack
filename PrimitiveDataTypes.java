public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // Integer types
        byte myByte = 100; // 8-bit signed integer, range -128 to 127
        short myShort = 30000; // 16-bit signed integer, range -32,768 to 32,767
        int myInt = 2000000000; // 32-bit signed integer, range approx -2*10^9 to 2*10^9
        long myLong = 9000000000000000000L; // 64-bit signed integer, requires 'L' suffix

        // Floating-point types
        float myFloat = 3.14f; // 32-bit floating-point, requires 'f' suffix
        double myDouble = 3.1415926535; // 64-bit floating-point (default for decimals)

        // Character type
        char myChar = 'A'; // 16-bit Unicode character

        // Boolean type
        boolean myBoolean = true; // Represents a logical value: true or false

        // Printing the values
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
    }
}