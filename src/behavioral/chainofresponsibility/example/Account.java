package behavioral.chainofresponsibility.example;

public abstract class Account {
    protected Account successor;
    protected int balance;

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(float amountToPay) throws Exception {
        if (this.canPay(amountToPay)) {
            System.out.println("Paid " + amountToPay + " " + getClass().getSimpleName());
        } else if (this.canPay(amountToPay)) {
            System.out.println("Cannot pay using " + getClass().getSimpleName() + ". Proceeding...");
        } else {
            throw new Exception("None of the accounts have enough balance");
        }
    }

    public boolean canPay(float amount) {
        return this.balance >= amount;
    }
}
