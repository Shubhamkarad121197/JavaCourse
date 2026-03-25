
public class IfElse{
    public static void main(String a[]){
        int marks=65;
        if(marks>=75){
            System.out.println("Grade A");
        }
        else if(marks>=60 & marks<75){
            System.out.println("Grade B");
        }
        else if(marks>=40 & marks<60){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

    }
}