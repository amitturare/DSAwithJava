package assignment;
/*
    Q1. Consider "Bank System" and decide classes,variables,methods about this.
    And try to encapsulate it in the concept of Encapsulation.
*/

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Getters and setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    // Personalized Methods
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}

public class question1_encapsulation {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setBalance(100);
        acc1.setAccountNumber("#123");
        acc1.setAccountHolderName("Amit");

        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Account Holder Name: " + acc1.getAccountHolderName());

        acc1.deposit(100);
        System.out.println("After DEPOSIT, Balance: " + acc1.getBalance());

        acc1.withdraw(50);
        System.out.println("After WITHDRAW, Balance: " + acc1.getBalance());

        System.out.println(acc1);
    }
}