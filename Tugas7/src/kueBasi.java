public class kueBasi extends Kue {

    private int lamaKue;

    public kueBasi(String nama, double harga, int lamaKue) {
        super(nama, harga);
        this.lamaKue = lamaKue;
    }

    @Override
    double hitungHarga() {
       return getHarga() - (lamaKue * (getHarga()*0.1));
    }

}
