package structural.proxy.example;

public class SecureCoor {
    protected Door door;

    public SecureCoor(Door door) {
        this.door = door;
    }

    public void open(String password) {
        if (this.authenticate(password)) {
            this.door.open();
        } else {
            System.out.println("Big no! It ain't possible");
        }
    }

    public boolean authenticate(String password) {
        return password.equalsIgnoreCase("secret");
    }

    public void close() {
        this.door.close();
    }
}
