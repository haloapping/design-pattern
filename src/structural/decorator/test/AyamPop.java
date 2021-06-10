package structural.decorator.test;

public class AyamPop implements NasiPadang {
    protected NasiPadang nasiPadang;

    public AyamPop(NasiPadang nasiPadang) {
        this.nasiPadang = nasiPadang;
    }

    @Override
    public int getPrice() {
        return this.nasiPadang.getPrice() + 9000;
    }

    @Override
    public String getDetailMenu() {
        return this.nasiPadang.getDetailMenu() + ", ayam pop";
    }
}
