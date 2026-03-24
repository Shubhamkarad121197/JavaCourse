class TypeConversion{
    public static void main(String[] args) {
        byte b=127;
        int a=b;
          System.out.println(a); //127
        int val=127;
        // byte k=val; //incompatiable types

       
        byte k= (byte)val;
        System.out.println(k);//127

        int val1=257;
        // byte k=val; //incompatiable types

       
        byte k1= (byte)val1;
        System.out.println(k1);//1 //Due to outof range 

         float f=5.6f;
        int i=(int) f;
        System.err.println(i); //5


        //Type Promotion

        byte b1=10;
        byte b2=30;

        int result=b1*b2;

        System.err.println(result); //300
    }
}