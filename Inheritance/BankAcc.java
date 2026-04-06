class Account{
    protected double balance;

    Account(double balance){
        this.balance=balance;

    }

    void displayBalance(){
        System.out.println("Balance:"+balance);
    }
}


class SavingsAccount extends Account{
    SavingsAccount(double balance){
        super(balance);

    }

    void addInterest(){
        balance+=balance*0.5;
    }
}
class BankAcc{
    public static void main(String args[]){
        SavingsAccount acc=new SavingsAccount(1000);

        acc.addInterest();
        acc.displayBalance();


    }
}