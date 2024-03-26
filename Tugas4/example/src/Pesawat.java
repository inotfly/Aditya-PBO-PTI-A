public class Pesawat {
    String jenisPesawat;
    String maskapai;
    String alamatAsal;
    String alamatTujuan;
    int jumlahPenumpang;

    public Pesawat() {
        jenisPesawat = "";
        jumlahPenumpang = 0;
        maskapai = "";
        alamatAsal = "";
        alamatTujuan = "";
    }

    public Pesawat(String maskapai) {
        this.maskapai = maskapai;
    }

    public Pesawat(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public Pesawat(String jenis, int jumlah, String maskapai, String asal, String tujuan) {
        this.jenisPesawat = jenis;
        this.jumlahPenumpang = jumlah;
        this.maskapai = maskapai;
        this.alamatAsal = asal;
        this.alamatTujuan = tujuan;
    }

    // Method overloading terbang #1
    public void terbang() {
        System.out.println("Pesawat " + jenisPesawat + " milik " + maskapai + " terbang dari " + alamatAsal + " ke " + alamatTujuan + ".");
    }

    // Method overloading terbang #2
    public void terbang(int kecepatan) {
        System.out.println("Pesawat " + jenisPesawat + " milik " + maskapai + " terbang dari " + alamatAsal + " ke " + alamatTujuan + " dengan kecepatan " + kecepatan + " km/h.");
    }

    // Method overloading terbang #3
    public void terbang(String waktu) {
        System.out.println("Pesawat " + jenisPesawat + " milik " + maskapai + " terbang dari " + alamatAsal + " ke " + alamatTujuan + " pada " + waktu + ".");
    }

    void printList() {
        System.out.println("Jenis Pesawat " + this.jenisPesawat);
        System.out.println("Jumlah Penumpang di pesawat " + this.jenisPesawat + " adalah " + this.jumlahPenumpang);
        System.out.println("Pesawat " + this.jenisPesawat + " berangkat dari Maskapai  " + this.maskapai);
        System.out.println("========");
    }
}
