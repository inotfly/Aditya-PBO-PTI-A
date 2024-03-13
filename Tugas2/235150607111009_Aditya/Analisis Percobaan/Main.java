//soal no 9

class Mahasiswa {
    int halaman;
    int kataPerHari;

    Mahasiswa(int halaman, int kataPerHari) {
        this.halaman = halaman;
        this.kataPerHari = kataPerHari;
    }
    
    public int getHalaman() {
        return halaman;
    }
    
    public int getKata() {
        return kataPerHari;
    }

    double hitungHariUntukMenghabiskanBuku() {
        double halamanHarian = (double) kataPerHari / 200; // 1 halaman = 400 kata (2 halaman = 800 kata)
        double hari1 = (double) halaman / (halamanHarian * 2) ;
        return hari1;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa membaca = new Mahasiswa(50, 100);
        
        //Inputan bacaan dan halaman
        System.out.println("Jumlah halaman: " + membaca.getHalaman());
        System.out.println("Jumlah bacaan per hari: " + membaca.getKata());

        double waktu = membaca.hitungHariUntukMenghabiskanBuku();
        System.out.println("Waktu yang dibutuhkan untuk membaca buku: " + waktu + " hari.");
    }
}
