public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public String toString(){
        return super.toString() + "\nUpahnya : " + getUpah();
    }

   @Override
    public double hitungGaji() {
        return upah;
    }
}