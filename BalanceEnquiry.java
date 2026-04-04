class Account {

    private long accountNumber;
    private double balance;

    // Constructor
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method with correct condition
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } 
        else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BalanceEnquiry {
    public static void main(String[] args) {

        Account acc = new Account(60228153779L, 6000);

        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}