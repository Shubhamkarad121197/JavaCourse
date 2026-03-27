
class StudentInfo{
    void displayStudentDetails(String name,int age){
        System.out.println("Hello My name is: "+name+" "+"And I am"+" "+age);

    }
}

public class Student{
    public static void main(String args[]){

        StudentInfo obj=new StudentInfo();
        obj.displayStudentDetails("Shubham", 28);
        obj.displayStudentDetails("Kartikee", 25);

    }
}
