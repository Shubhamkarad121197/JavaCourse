class NumberCheck {

    String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is Even";
        } else {
            return num + " is Odd";
        }
    }
}

public class EvenOdd {
    public static void main(String args[]) {
        NumberCheck obj = new NumberCheck();

        System.out.println(obj.checkEvenOdd(25));
        System.out.println(obj.checkEvenOdd(36));
    }
}
