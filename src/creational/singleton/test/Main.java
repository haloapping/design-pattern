package creational.singleton.test;

public class Main {
    public static void main(String[] args) {
        GirlFriend rahel = GirlFriend.getInstance();
        GirlFriend anotherRahel = new GirlFriend();

        System.out.println("Profile");
        System.out.println("Name: " + rahel.getName());
        System.out.println("Cute: " + rahel.isCute());

        System.out.println(rahel.equals(anotherRahel));

        GirlFriend rahel1 = GirlFriend.getInstance();
    }
}
