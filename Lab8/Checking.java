// Abstract class BankAccount
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal amount must be positive and not exceed the balance.");
        }
    }
}

// Main class to test the implementation
public class Checking {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount("123456789", 1000.0);

        // Calling deposit and withdraw methods
        account.deposit(500.0);   // Deposited: $500.0, New Balance: $1500.0
        account.withdraw(200.0);  // Withdrew: $200.0, New Balance: $1300.0
    }
}
