class Calculator{
    int add(int n1,int n2){
        return n1+n2;
    }
}

class  AdvanceCalc extends Calculator{
    int add(int n1,int n2){
        return n1+n2+1;
    }
}


public class Overding {

    public static void main(String args[]){

        AdvanceCalc calc=new AdvanceCalc();

        int r1=calc.add(34,65);
        System.out.println(r1);

    }
    
}


//Method overloading basically means in two different class have method with same name, with same parameter but different behaviour called as method overiding