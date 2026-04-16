import java.util.Scanner;

public class TakeDifferentTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        System.out.print("Enter double: ");
        double d = sc.nextDouble();

        System.out.print("Enter word: ");
        String word = sc.next();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter full sentence: ");
        String line = sc.nextLine();

        System.out.println(num + " " + d + " " + word + " " + line);
    }
}