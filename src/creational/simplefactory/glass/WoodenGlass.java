package creational.simplefactory.glass;

public class WoodenGlass implements Glass {
    protected float weight;
    protected float height;
    protected float price;

    public WoodenGlass(float weight, float height, float price) {
        this.weight = weight;
        this.height = height;
        this.price = price;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
