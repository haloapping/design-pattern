package behavioral.chainofresponsibility.example;

public class Bitcoin extends Account {
    protected float balance;

    public Bitcoin(float balance) {
        this.balance = balance;
    }
}
