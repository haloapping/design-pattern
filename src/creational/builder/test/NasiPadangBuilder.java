package creational.builder.test;

public class NasiPadangBuilder {
    protected int riceSize;
    protected int numberOfChickenRendang;
    protected boolean sauce;
    protected boolean spicySauce;
    protected boolean vegetable;

    public NasiPadangBuilder(int riceSize) {
        this.riceSize = riceSize;
    }

    public NasiPadangBuilder addChicken(int numberOfChickenRendang) {
        this.numberOfChickenRendang = numberOfChickenRendang;
        return this;
    }

    public NasiPadangBuilder addSauce() {
        this.sauce = true;
        return this;
    }

    public NasiPadangBuilder addSpicySauce() {
        this.spicySauce = true;
        return this;
    }

    public NasiPadangBuilder addVegetable() {
        this.vegetable = true;
        return this;
    }

    public NasiPadang wrap() {
        return new NasiPadang(this);
    }
}
