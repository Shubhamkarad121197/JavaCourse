interface A{
    void display();
}

interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("In SHow");
    }
    public void display(){
        System.out.println("In Display");
    }

    
}

public class Multiple {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.display();
    }
}
