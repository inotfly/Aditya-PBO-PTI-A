public class PegawaiHarian extends Pegawai {
    private double upahPerjam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerjam, int totalJam) {
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }

    public double getUpahPerjam() {
        return upahPerjam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public String toString(){
        return super.toString() + "\nupah per jam :" + getUpahPerjam() + "\nTotal Jam kerja : " + getTotalJam() + " jam." ;
    }

    public void nPendapatan(){

    }

    @Override
    public double hitungGaji(){
        int jamNormal = 40;
        int jamLembur = totalJam - jamNormal;
        if (totalJam <= 40){
            return upahPerjam*totalJam;
        } else {
            return (upahPerjam * jamNormal) + (upahPerjam * 1.5 * jamLembur);
        }
    }
    
}
