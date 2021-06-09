package creational.factorymethod.test1;

public class CarpenterManager extends HiringArtisanFactory {
    @Override
    protected Artisan makeArtisan() {
        return new Carpenter();
    }
}
