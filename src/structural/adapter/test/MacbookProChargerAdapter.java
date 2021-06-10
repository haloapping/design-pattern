package structural.adapter.test;

public class MacbookProChargerAdapter implements Laptop {
    protected MacbookPro macbookPro;

    MacbookProChargerAdapter(MacbookPro macbookPro) {
        this.macbookPro = macbookPro;
    }

    @Override
    public void chargingWithTwoLeggedPlug() {
        this.macbookPro.chargingWithThreeLeggedPlug();
    }
}
