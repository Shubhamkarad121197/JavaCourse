

class Animal{
    void sound(){
        System.out.println("Animal Makes a sound");
    }
}

class Dog extends Animal{
     void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}
