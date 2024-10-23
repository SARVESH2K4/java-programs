// Superclass representing a basic bank account
class BankAccount {
    protected double balance;
    protected String accountHolder;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

// Subclass representing a specialized savings account with an interest rate
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 1000) {
            double interest = amount * interestRate;
            balance += interest;
            System.out.println("Interest added: $" + interest);
        }
        super.deposit(amount);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: $" + interest);
    }
}

// Test class to demonstrate method overriding in action
public class Main {
    public static void main(String[] args) {
        // Create a basic bank account
        BankAccount basicAccount = new BankAccount("Sarvesh", 5000);
        System.out.println("Basic Account Info:");
        basicAccount.displayAccountInfo();
        basicAccount.deposit(500);
        basicAccount.withdraw(1000);
        System.out.println();

        // Create a savings account with interest rate of 5%
        SavingsAccount savingsAccount = new SavingsAccount("Vivek", 10000, 0.05);
        System.out.println("Savings Account Info:");
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(2000);  // This will trigger interest calculation
        savingsAccount.withdraw(1500);
        savingsAccount.applyInterest();
    }
}
