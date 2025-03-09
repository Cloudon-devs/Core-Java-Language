package assignments.constructors;

public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    BankAccount deposit(double amount) {
        this.balance += amount;
        return this;
    }

    BankAccount withdraw(double amount) {
        this.balance -= amount;
        return this;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12345", 1000);
        b1.displayBalance();
        b1.deposit(500).displayBalance();
        b1.withdraw(200).displayBalance();
    }
}
