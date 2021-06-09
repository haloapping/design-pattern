package creational.factorymethod.test1;

public abstract class HiringArtisanFactory {
    protected abstract Artisan makeArtisan();

    public void takeArtisan() {
        Artisan artisan = this.makeArtisan();
        artisan.makeHandiCraft();
    }
}
