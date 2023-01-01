package sw.com.demo.model;


public class Wallet {
    public double balance;
    int cardid;

    public Wallet() {
        this.balance=0.0;
    }

    public Wallet(double balance, int cardid) {
        this.balance = balance;
        this.cardid = cardid;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

}
