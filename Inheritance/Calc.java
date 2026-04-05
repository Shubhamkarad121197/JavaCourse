
class Calculator{
    int add(int n1,int n2){
        return n1+n2;
    }
    int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvanceCalc extends Calculator{
     int multi(int n1,int n2){
        return n1*n2;
    }
    int div(int n1,int n2){
        return n1/n2;
    }


}

class ScientificCalc extends AdvanceCalc{
    double power(int n1,int n2){

        return Math.pow(n1, n2);
    }
}
public class Calc {
    public static void main(String args[]){

        ScientificCalc obj=new ScientificCalc();
        int add=obj.add(56, 34);
        int sub=obj.sub(45, 30);
        int mul=obj.multi(5, 45);
        int div=obj.div(21,3);
         double power=obj.power(4, 2);

        System.out.println("Add:"+add);
        System.out.println("Sub:"+sub);
        System.out.println("multi:"+mul);
        System.out.println("division:"+div);
         System.out.println("power:"+power);

    }
}