package creational.singleton.example;

public class President {
    private static President instance;

    public President() {}

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }

        return instance;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
