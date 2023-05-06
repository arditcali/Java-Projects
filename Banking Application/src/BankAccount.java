public class BankAccount {
    private String owner;
    private double balance;
    private double withdraw;
    private double deposit;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void setWithdraw(double withdraw) {
        this.balance -= withdraw;
    }

    public void setDeposit(double deposit) {
        this.balance += deposit;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return owner;
    }

}
