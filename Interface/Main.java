interface Animal {

    int x = 10; // public static final

    void sound(); // abstract

    default void sleep() {
        System.out.println("Sleeping...");
    }

    static void info() {
        System.out.println("Animal interface");
    }
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.sleep();

        Animal.info();
    }
}