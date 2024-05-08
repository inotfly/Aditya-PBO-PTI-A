class kuePesanan extends Kue {
    private double berat;

    public double getBerat() {
        return berat;
    }

    public kuePesanan(String nama, double harga, double berat ) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }
}
