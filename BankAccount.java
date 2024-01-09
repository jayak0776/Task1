class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void getAccountDetails() {
        System.out.println();
        System.out.println("Account Holder:" + accountHolder);
        System.out.println("Account Number:" + accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Amount:" + amount + ",New Balance:" + balance);
        } else {
            System.out.println("Invaild Deposit Amount,Enter Properly!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Amount:" + amount + ",New Balance:" + balance);
            } else {
                System.out.println("Insufficient Amount funds!");
            }
        } else {
            System.out.println("Invaild Withdrawal Amount,Please Enter Properly!");
        }
    }

    public void currentBalance() {
        System.out.println("Current Saving:" + balance);
    }

    public static void main(String args[]) {
        BankAccount account1 = new BankAccount("Gubbala Jaya Kumar", "XXXXXXXXX0124", 5000);
        BankAccount account2 = new BankAccount("Mondi Durga Veera Venkata Manikanta", "XXXXXXXXX0235", 23000);

        account1.getAccountDetails();
        account1.currentBalance();
        account1.deposit(15750);
        account1.withdraw(3500);
        account1.currentBalance();

        account2.getAccountDetails();
        account2.currentBalance();
        account2.deposit(15750);
        account2.withdraw(3500);
        account2.currentBalance();
    }
}