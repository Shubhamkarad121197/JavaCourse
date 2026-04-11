


abstract class Payment{
    abstract void pay();

    void reciept(){
        System.out.println("Payment done successfully..");
    }
}

class UPI extends Payment{
    void pay(){
        System.out.println("Pay Via UPI");
    }

}
public class BankClass {
    public static void main(String[] args) {
          Payment p=new UPI();
        p.pay();
        p.reciept();
    }
}
