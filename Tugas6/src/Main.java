
public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("Sandi Bojinov", "111111", true, true);
        System.out.println(a);
        System.out.println("------------------");

        MahasiswaFILKOM b = new MahasiswaFILKOM("235150607111009", 4.0, "Bulldog", "111", false, false);
        System.out.println(b);
        System.out.println("------------------");

        Pekerja c = new Pekerja(1000, 2016, 4, "Aan Android", true, "111", true);
        System.out.println(c);
        System.out.println("------------------");

        Manager d = new Manager("HRD", 1000, 2017, 3, "Komed Sitong", true, "111", true);
        System.out.println(d);
        System.out.println("------------------");
    }
}