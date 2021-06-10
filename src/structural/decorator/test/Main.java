package structural.decorator.test;

public class Main {
    public static void main(String[] args) {
        NasiPadangBasic nasiPadangBasic = new NasiPadangBasic();
        System.out.println("Description : " + nasiPadangBasic.getDetailMenu());
        System.out.println("Cost        : " + nasiPadangBasic.getPrice() + "\n");

        AyamPop addAyamPop = new AyamPop(nasiPadangBasic);
        System.out.println("Description : " + addAyamPop.getDetailMenu());
        System.out.println("Cost        : " + addAyamPop.getPrice() + "\n");

        Cincang addCincang = new Cincang(addAyamPop);
        System.out.println("Description : " + addCincang.getDetailMenu());
        System.out.println("Cost        : " + addCincang.getPrice() + "\n");

        TelurDadar addTelurDadar = new TelurDadar(addCincang);
        System.out.println("Description : " + addTelurDadar.getDetailMenu());
        System.out.println("Cost        : " + addTelurDadar.getPrice() + "\n");
    }
}
