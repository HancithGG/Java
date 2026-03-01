//Write a Java program to demonstrate encapsulation using a BankAccount class with private fields, methods to deposit and withdraw money with validation, and a method to display the balance.
class BankAccount {

    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(12345, 5000);

        b.deposit(2000);
        b.withdraw(3000);

        b.accountNumber = 800949; // unable to change you get error

        System.out.println("Balance: " + b.getBalance());
    }
}
