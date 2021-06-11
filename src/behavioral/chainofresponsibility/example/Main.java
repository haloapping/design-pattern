package behavioral.chainofresponsibility.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(100);
        Paypal paypal = new Paypal(200);
        Bitcoin bitcoin = new Bitcoin(300);

//        bank.setNext(paypal);
//        bank.setNext(bitcoin);

        bank.pay(20);
    }
}
