import java.text.NumberFormat;
import java.util.Locale;

abstract class Kue {
    private String nama;
    private double harga;
    NumberFormat dalamRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "IDR"));

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama :" + nama + "Harga :" + dalamRupiah.format(harga);
    }

}
