
public class Main {
    public static void main(String[] args) {
        // casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();
        hero1.type = "Racing";

        HeroAgility hero99 = new HeroAgility("Cyclops Dajjal", 999);
        hero99.display();

        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        // System.out.println(heroUp.getType()); //ini error
        // Object dgn class Hero

        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();
        // downcasting

        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        // heroDown.display();

        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting
        hero2.type = "Racing";

        // HeroAgility hero3 = (HeroAgility) heroReg;
        // hero3.display();

        // Membuat objek
        HeroMagic heroMagic = new HeroMagic("Jajang", 999);

        // Upcast
        Hero heroUpMagic = (Hero) heroMagic;
        System.out.println("Nama: " + heroUpMagic.getName());
        System.out.println("Nyawaa : " + heroUpMagic.getHealth());
        
        // Downcasting
        HeroMagic heroDownMagic = (HeroMagic) heroUpMagic;
        heroDownMagic.display();

    }
}