package factorymethod.test1;

public class Carpenter implements Artisan {
    @Override
    public void makeHandiCraft() {
        System.out.println("Carpenter  : Making wood crafts");
    }
}
