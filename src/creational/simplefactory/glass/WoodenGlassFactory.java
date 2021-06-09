package creational.simplefactory.glass;

public class WoodenGlassFactory {
    public Glass makeGlass(float weight, float height, float price) {
        return new WoodenGlass(weight, height, price);
    }
}