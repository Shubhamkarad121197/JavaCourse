class Demo {

    static int count = 0; // static variable

    static {
        System.out.println("Static block");
    }

    Demo() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticConcept {
    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        Demo.showCount();
    }
}