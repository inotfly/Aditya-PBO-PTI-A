public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen,double gaji, int tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + 0.1 * getGaji();
    }

    public String toString() {
        return super.toString() + "\nDepartemen   : " + departemen;
    }
}
