package behavioral.chainofresponsibility.example;

public class Paypal extends Account {
    protected float balance;

    public Paypal(float balance) {
        this.balance = balance;
    }
}
