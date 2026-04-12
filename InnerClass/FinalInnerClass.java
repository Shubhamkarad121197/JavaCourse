class Outer {

    int x = 10;
    static int y = 20;

    // Member Inner Class
    class Inner {
        void show() {
            System.out.println("Member Inner: " + x);
        }
    }

    // Static Nested Class
    static class StaticInner {
        void display() {
            System.out.println("Static Inner: " + y);
        }
    }

    void showLocalInner() {

        // Local Inner Class
        class LocalInner {
            void print() {
                System.out.println("Local Inner Class");
            }
        }

        LocalInner li = new LocalInner();
        li.print();
    }
}

abstract class Animal {
    abstract void sound();
}

public class FinalInnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer();

        // Member inner class
        Outer.Inner inner = outer.new Inner();
        inner.show();

        // Static nested class
        Outer.StaticInner si = new Outer.StaticInner();
        si.display();

        // Local inner class
        outer.showLocalInner();

        // Anonymous inner class
        Animal a = new Animal() {
            @Override
            void sound() {
                System.out.println("Anonymous: Dog barks");
            }
        };

        a.sound();
    }
}