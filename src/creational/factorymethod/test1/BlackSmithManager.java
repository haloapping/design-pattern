package creational.factorymethod.test1;

public class BlackSmithManager extends HiringArtisanFactory {
    @Override
    protected Artisan makeArtisan() {
        return new BlackSmith();
    }
}
