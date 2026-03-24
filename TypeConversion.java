class TypeConversion {
    public static void main(String[] args) {

        // Implicit Conversion
        byte b = 127;
        int a = b;
        System.out.println("Implicit: " + a);

        // Explicit Casting
        int val = 127;
        byte k = (byte) val;
        System.out.println("Casting: " + k);

        // Overflow Example
        int val1 = 257;
        byte k1 = (byte) val1;
        System.out.println("Overflow: " + k1);

        // Float to Int
        float f = 5.6f;
        int i = (int) f;
        System.out.println("Float to Int: " + i);

        // Type Promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println("Type Promotion: " + result);
    }
}