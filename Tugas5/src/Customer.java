public class Customer {
    private String nomorRekening;
    private String nama;
    private double saldo;
    private int pin;
    private int percobaanAutentikasi;

    public Customer(String nomorRekening, String nama, double saldo, int pin) {
        this.nomorRekening = nomorRekening;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.percobaanAutentikasi = 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public boolean autentikasi(int pin) {
        if (this.pin == pin) {
            percobaanAutentikasi = 0; // Reset percobaan autentikasi setelah berhasil
            return true;
        } else {
            percobaanAutentikasi++;
            if (percobaanAutentikasi >= 3) {
                blokirAkun();
            }
            return false;
        }
    }

    private void blokirAkun() {
        System.out.println("Akun Anda telah diblokir karena beberapa kali percobaan autentikasi yang gagal.");
    }

    public void topUp(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Top up berhasil. Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Jumlah top up tidak valid.");
        }
    }

    public void pembelian(double jumlah) {
        if (autentikasiPIN()) {
            if (jumlah > 0) {
                double cashback = hitungCashback(jumlah);
                saldo -= jumlah - cashback;
                System.out.println("Pembelian berhasil. Jumlah debet: Rp " + jumlah + ", Cashback: Rp " + cashback + ", Saldo baru: Rp " + saldo);
            } else {
                System.out.println("Jumlah pembelian tidak valid.");
            }
        } else {
            System.out.println("Autentikasi gagal. Silakan coba lagi nanti.");
        }
    }

    private boolean autentikasiPIN() {
        return true;
    }

    private double hitungCashback(double jumlah) {
        double persentaseCashback;
        if (nomorRekening.startsWith("38")) {
            persentaseCashback = 0.05;
        } else if (nomorRekening.startsWith("56")) {
            persentaseCashback = 0.07;
            if (jumlah > 1000000) {
                persentaseCashback += 0.02;
            }
        } else if (nomorRekening.startsWith("74")) {
            persentaseCashback = 0.10;
            if (jumlah > 1000000) {
                persentaseCashback += 0.05;
            }
        } else {
            persentaseCashback = 0;
        }
        return jumlah * persentaseCashback;
    }
}
