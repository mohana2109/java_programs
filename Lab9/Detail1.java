import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements Account {
    double balance;
    double interestRate;

    public SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Account {
    double balance;
      double interestRate;


    public CurrentAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
            }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
          balance -= amount;
    }


    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }

}

class Bank {
    List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: $" + account.getBalance());
        }
    }
}

public class Detail1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Choose account type: 1. Savings Account  2. Current Account");
        int accountChoice = scanner.nextInt();

        Account account = null;
        if (accountChoice == 1) {
            System.out.print("Enter initial deposit for Savings Account: ");
            double savingsInitialDeposit = scanner.nextDouble();
            System.out.print("Enter interest rate for Savings Account: ");
            double interestRate = scanner.nextDouble();
            account = new SavingsAccount(savingsInitialDeposit, interestRate);
        } else if (accountChoice == 2) {
            System.out.print("Enter initial deposit for Current Account: ");
            double currentInitialDeposit = scanner.nextDouble();
             System.out.print("Enter interest rate for Savings Account: ");
            double interestRate = scanner.nextDouble();

            account = new CurrentAccount(currentInitialDeposit,interestRate);
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        bank.addAccount(account);

        System.out.println("Choose transaction type: 1. Deposit  2. Withdraw");
        int transactionChoice = scanner.nextInt();

        if (transactionChoice == 1) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            bank.deposit(account, amount);
        } else if (transactionChoice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            bank.withdraw(account, amount);
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        bank.printAccountBalances();

        if (account instanceof SavingsAccount) {
            ((SavingsAccount) account).applyInterest();
            System.out.println("\nAfter applying interest:");
            bank.printAccountBalances();
        }

         }
}
