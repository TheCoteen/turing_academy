package az.edu.turing.MyApps.BankingApplication;

public class DebitCard {
    public static final int CAPACITY = 2000;

    private int balance;

    public int loan;

    public DebitCard(int amount) {
        this.balance = amount;
    }

    public DebitCard() {
        this.balance = 0;
    }

    public int getAmount() {
        return balance;
    }



    public void addAmount(int amount){

        this.balance += amount;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "balance=" + balance +
                ", loan=" + loan +
                '}';
    }
}
