// Superclass
class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int term;

    public FixedDepositAccount(int accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account with Term: " + term + " years");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1001, 50000, 5.5);
        CheckingAccount c = new CheckingAccount(1002, 20000, 10000);
        FixedDepositAccount f = new FixedDepositAccount(1003, 100000, 3);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

