public class Truk {
    String merk;
    String bahanBakar;
    int jumlahBan;

    public Truk(String merk, String bahanBakar, int jumlahBan) {
        this.merk = merk;
        this.bahanBakar = bahanBakar;
        this.jumlahBan = jumlahBan;
    }

    void angkutan() {
        System.out.println("Truk " + this.merk + " sedang mengangkut sawit");
    }

    void muatan() {
        System.out.println("Truk " + this.merk + " mengangkut banyaknya sawit di sulawesi.");
    }

    void isiBahanBakar(int kapasitasTruk) {
        System.out.println("Truk " + this.merk + " memiliki kapasitas pertamax kurang lebih sebanyak " + kapasitasTruk + " liter.");
    }

}
