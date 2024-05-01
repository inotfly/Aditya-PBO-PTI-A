import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public Pekerja(double gaji, int tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1,1);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        long tahunKerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (tahunKerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunKerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getTunjanganAnak(){
        return jumlahAnak * 20;
    }

    public double GajiBonus() {
        return gaji + getBonus() + getTunjanganAnak();
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk  : " + tahunMasuk.getYear() + "\nJumlah Anak  : " + jumlahAnak + "\nGaji         : " + GajiBonus();
    }

}
