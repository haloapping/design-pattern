package structural.decorator.test;

public class Cincang implements NasiPadang {
    protected NasiPadang nasiPadang;

    public Cincang(NasiPadang nasiPadang) {
        this.nasiPadang = nasiPadang;
    }

    @Override
    public int getPrice() {
        return this.nasiPadang.getPrice() + 15000;
    }

    @Override
    public String getDetailMenu() {
        return this.nasiPadang.getDetailMenu() + ", cincang";
    }
}
