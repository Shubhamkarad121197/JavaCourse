class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        int num1 = 45, num2 = 34;
        Calc addition = new Calc();
        int result = addition.add(num1, num2);

        System.out.println(result);
    }
}