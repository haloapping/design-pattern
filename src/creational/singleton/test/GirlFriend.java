package creational.singleton.test;

public class GirlFriend {
    private String name = "Rahel Cantik, Tembem, dan Gumush";
    private boolean cute = true;
    private static GirlFriend instance;

    public GirlFriend() {}

    public static GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
            System.out.println("Instance is existing");
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
