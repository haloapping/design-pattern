package structural.decorator.test;

public class TelurDadar implements NasiPadang {
    protected NasiPadang nasiPadang;

    public TelurDadar(NasiPadang nasiPadang) {
        this.nasiPadang = nasiPadang;
    }

    @Override
    public int getPrice() {
        return this.nasiPadang.getPrice() + 5000;
    }

    @Override
    public String getDetailMenu() {
        return this.nasiPadang.getDetailMenu() + ", telur dadar";
    }
}
