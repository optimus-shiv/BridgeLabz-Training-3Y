class BankAccount {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; // Final - cannot be changed

    // Constructor using 'this'
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display details with instanceof check
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("John", 101);
        BankAccount a2 = new BankAccount("Alice", 102);

        a1.displayDetails();
        a2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
