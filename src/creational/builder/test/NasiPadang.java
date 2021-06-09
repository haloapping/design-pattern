package creational.builder.test;

public class NasiPadang {
    private int riceSize = 1;
    private int numberOfChickenRendang = 0;
    private boolean sauce = false;
    private boolean spicySauce = false;
    private boolean vegetable = false;

    public NasiPadang(NasiPadangBuilder builder) {
        this.riceSize = builder.riceSize;
        this.numberOfChickenRendang = builder.numberOfChickenRendang;
        this.sauce = builder.sauce;
        this.spicySauce = builder.spicySauce;
        this.vegetable = builder.vegetable;
    }

    public int getRiceSize() {
        return riceSize;
    }

    public int getNumberOfChickenRendang() {
        return numberOfChickenRendang;
    }

    public boolean isSauce() {
        return sauce;
    }

    public boolean isSpicySauce() {
        return spicySauce;
    }

    public boolean isVegetable() {
        return vegetable;
    }
}
