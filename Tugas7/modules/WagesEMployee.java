import java.time.LocalDate;

public class WagesEMployee extends Employee {

    private double produksiMingguan;
    private double upahBarang;

    public WagesEMployee(String name, String noKTP, double produksiMingguan, double upahBarang, LocalDate hariUlangTahun) {
        super(name, noKTP, hariUlangTahun);
        this.produksiMingguan = produksiMingguan;
        this.upahBarang = upahBarang;
    }

    public double getProduksiMingguan() {
        return produksiMingguan;
    }

    public void setProduksiMingguan(double produksiMingguan) {
        this.produksiMingguan = produksiMingguan;
    }

    public double getUpahBarang() {
        return upahBarang;
    }

    public void setUpahBarang(double upahBarang) {
        this.upahBarang = upahBarang;
    }

    
    public double earnings(){
        return getUpahBarang() * getProduksiMingguan();
    }

    public String toString(){
        return String.format("Upahnya : " +super.toString() + "\nProduksi per minggu: " + getProduksiMingguan() + "\nUpah barang: " + getUpahBarang());
    }
}
