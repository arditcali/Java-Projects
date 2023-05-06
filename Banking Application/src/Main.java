
public class Main {
    public static void main(String[] args) {

        BankAccount ben = new BankAccount("Ben", 250.0);

        ben.setWithdraw(20);
        System.out.println(ben.getBalance());
        System.out.println();

        ben.setDeposit(100);
        System.out.println(ben.getBalance());
        System.out.println();

        System.out.println("The account owner is: " + ben.getOwner());
    }
}