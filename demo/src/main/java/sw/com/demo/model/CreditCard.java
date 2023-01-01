package sw.com.demo.model;

public class CreditCard {
    public double balance ;

    public CreditCard(){
    }
    public CreditCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
