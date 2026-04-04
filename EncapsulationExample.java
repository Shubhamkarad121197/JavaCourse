
class Human{
    private String name=null;
    private int age=0;
    
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
     public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setName("Shubham");
        obj.setAge(28);
        
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
