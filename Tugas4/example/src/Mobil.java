public class Mobil {
    String merk;
    String noMesin;
    int tahunProduksi;
    String statusParkir;

    public Mobil(String merk, String noMesin, int tahunProduksi, String statusParkir) {
        this.merk = merk;
        this.noMesin = noMesin;
        this.tahunProduksi = tahunProduksi;
        this.statusParkir = statusParkir;
    }

    void jalankan(){
        System.out.println("Mobil " + this.merk + " berjalan di depan Mall");
    }

    void informasiKerusakan(){
        System.out.println("Mobil " + this.merk + " memiliki kerusakan di bagian mesin dengan kode " + this.noMesin);
    }

    void parkir(String lokasi){
        System.out.println("Mobil " + this.merk + " sedang parkir di mall dengan keadaan " + this.statusParkir);
    }

}
