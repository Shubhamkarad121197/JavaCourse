
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class AnimalExample {
    public static void main(String a[]){
        Animal an=new Dog();

        an.sound();

    }
}
