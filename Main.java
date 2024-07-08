import java.util.ArrayList;

// Account class to represent a bank account
class Account {

    private int accountNumber;
    private String customerName;
    private double balance;

    // Create constructor
    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }
}

//Bank class to manage accounts
class Bank {

    private ArrayList<Account> accounts;

    //Create constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    //Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber() + " - " + account.getCustomerName());
    }

    //Method to remove an account
    public void removeAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                System.out.println("Account removed: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }

    //Method to deposit money into an account
    public void deposit(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }

    //Method to withdraw money from an account
    public void withdraw(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }
}

//Main class to test the Bank and Account classes
public class Main {

    public static void main(String[] args) {
        //Create a bank object
        Bank bank = new Bank();

        //Create accounts and add them to the bank
        Account account1 = new Account(9009, "Chae In Kim", 50000.0);
        Account account2 = new Account(9909, "Julia Johnson", 10000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        //Deposit and withdraw money from accounts
        bank.deposit(9009, 200.0);
        bank.withdraw(9909, 500.0);

        //Attempt to try and remove an account
        bank.removeAccount(9009);
        bank.removeAccount(1001); // Trying to remove a non-existent account
    }
}
