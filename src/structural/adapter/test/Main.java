package structural.adapter.test;

import javax.crypto.Mac;

public class Main {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        MacbookPro macbookPro = new MacbookPro();
        MacbookProChargerAdapter macbookProChargerAdapter = new MacbookProChargerAdapter(macbookPro);

        User user = new User();

        user.charge(lenovo);
        user.charge(macbookProChargerAdapter);
    }
}
