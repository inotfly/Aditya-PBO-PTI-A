import java.util.Scanner;

class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    // no4
    public void setWaktu(double jam) {
        waktu = jam;
        rubahSekon(waktu);
    }

    public void rubahSekon(double jam) {
        waktu = jam * 3600;

    }

    public double getWaktu() {
        return waktu;
    }

    private void rubahKecepatan (){
        double kecepatanPerdetik = kecepatan + 1000 / 3600;
        System.out.println("Kecepatan perdetik: " + kecepatanPerdetik);
    }

    public void setKecepatan1(int kmPerjam){
        kecepatan = kmPerjam;
        rubahKecepatan();
    }

    public void hitungJarak(){
        double jarak = waktu * kecepatan / 1000;
        System.out.println("Jarak yang ditempuh oleh mobil adalah :" + jarak);
    }

    public void displayMessage() {
        System.out.println("Mobil " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan memiliki kecepatan " + kecepatan);
        System.out.println("Jarak yang dapat di tempuh dengan kecepatan " + kecepatan + "dalam waktu "+ waktu);
        hitungJarak();
    }
}

public class MainMobil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.println("Masukkan Kecepatan Mobil 1: ");
        int kecepatan1 = scanner.nextInt();
        m1.setKecepatan(kecepatan1);
        System.out.println("Masukkan Merk untuk Mobil 1: ");
        String manufaktur1 = scanner.next();
        m1.setManufaktur(manufaktur1);
        System.out.println("Masukkan NoPlat untuk Mobil 1: ");
        String noPlat1 = scanner.next();
        m1.setNoPlat(noPlat1);
        System.out.println("Masukkan Warna untuk Mobil 1: ");
        String warna1 = scanner.next();
        m1.setWarna(warna1);
        System.out.println("Masukkan Waktu untuk Mobil 1: ");
        double waktu1 = scanner.nextDouble();
        m1.setWaktu(waktu1);
        // Meminta pengguna untuk memasukkan waktu
        System.out.println("Masukkan waktu mobil 1 (jam): ");
        double waktuMobil1 = scanner.nextDouble();
        m1.setWaktu(waktuMobil1);
        // Menampilkan waktu mobil 1
        System.out.println("Waktu mobil 1 dalam detik: " + m1.getWaktu() + " detik");
        m1.displayMessage();
        System.out.println("================");

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.println("Masukkan Kecepatan Mobil 2: ");
        int kecepatan2 = scanner.nextInt();
        m2.setKecepatan(kecepatan2);
        System.out.println("Masukkan Merk untuk Mobil 2: ");
        String manufaktur2 = scanner.next();
        m2.setManufaktur(manufaktur2);
        System.out.println("Masukkan NoPlat untuk Mobil 2: ");
        String noPlat2 = scanner.next();
        m2.setNoPlat(noPlat2);
        System.out.println("Masukkan Warna untuk Mobil 2: ");
        String warna2 = scanner.next();
        m2.setWarna(warna2);
        System.out.println("Masukkan Waktu untuk Mobil 2: ");
        double waktu2 = scanner.nextDouble();
        m1.setWaktu(waktu2);
        m2.displayMessage();
        System.out.println("================");

        // merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 dirubah menjadi warna hijau");
        m1.setWarna("Hijau");

        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
