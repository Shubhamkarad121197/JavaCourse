public class LogicalOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        // AND (&&)
        System.out.println("AND (x > 5 && y < 10): " + (x > 5 && y < 10)); // true

        // OR (||)
        System.out.println("OR (x < 5 || y < 10): " + (x < 5 || y < 10)); // true

        // NOT (!)
        System.out.println("NOT !(x > y): " + !(x > y)); // false

        // Combined Example
        boolean result = (x > 5 && y < 10) || (x == y);
        System.out.println("Combined Result: " + result); // true
    }
}
