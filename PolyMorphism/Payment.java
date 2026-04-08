class BnkPayment{
    void pay(){
        System.out.println("Payment Processing");
    }
}

class UPI extends BnkPayment{
     void pay() {
        System.out.println("Pay via UPI");
    }
}

class Card extends BnkPayment{
     void pay() {
        System.out.println("Pay via Card");
    }
}

public class Payment {
    public static void main(String[] args) {

        BnkPayment p;

        p = new UPI();
        p.pay();

         p = new Card();
         p.pay();
        
    }
}
