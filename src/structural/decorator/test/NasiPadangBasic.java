package structural.decorator.test;

public class NasiPadangBasic implements NasiPadang {
    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getDetailMenu() {
        return "Nasi padang basic";
    }
}
