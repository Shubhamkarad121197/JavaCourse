// class Student{
//     String name="Shubham";
// }

// class ObjectClass{
//     public static void main(String args[]){
//         Student s1=new Student();

//         System.out.println(s1);//Student@24d46ca6
//     }
// }

class Student{
    String name="Shubham";
    public String toString(){
        return name;
    }
}
//Overide  it
class ObjectClass{
    public static void main(String[] args) {
         Student s = new Student();
        System.out.println(s); // calls toString()
    }
}