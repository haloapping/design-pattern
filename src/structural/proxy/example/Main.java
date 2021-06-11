package structural.proxy.example;

public class Main {
    public static void main(String[] args) {
        SecureCoor door = new SecureCoor(new LaboratoriumDoor());
        door.open("Invalid");

        door.open("secret");
        door.close();
    }
}
