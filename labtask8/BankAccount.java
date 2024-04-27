public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("depositing " + amount + " new balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawing " + amount + " new balance: " + balance);
        } else {
            System.out.println("Insufficient balance  " + amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

 
        Thread depositThread = new Thread();
        Thread withdrawThread = new Thread();
        account.deposit(200);
        account.withdraw(500);

        depositThread.start();
        withdrawThread.start();
    }
}
