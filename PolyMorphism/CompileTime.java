
class MathUtils{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}

class CompileTime{
    public static void main(String[] args) {
        MathUtils m=new MathUtils();

       System.out.println( m.add(23,43));
        System.out.println(m.add(34, 43, 45));
        
    }
}