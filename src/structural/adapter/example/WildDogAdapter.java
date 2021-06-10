package structural.adapter.example;

public class WildDogAdapter implements Lion {
    protected WildDog dog;

    WildDogAdapter(WildDog dog) {
        this.dog = dog;
    }

    @Override
    public void roar() {
        this.dog.bark();
    }
}
