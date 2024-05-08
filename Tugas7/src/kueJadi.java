public class kueJadi extends Kue {
    private double jumlah;

    public kueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return  getHarga() * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }
}
