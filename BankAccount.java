public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void getBalance() {
        System.out.println("Balance for " + owner + ": " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Cedric", 200);
        acc.deposit(100);
        acc.withdraw(50);
        acc.getBalance();
    }
}
