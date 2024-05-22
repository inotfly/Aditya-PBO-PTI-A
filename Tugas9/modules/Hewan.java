import java.util.Scanner;

public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    // Konstruktor dengan parameter nama dan umur
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama hewan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur hewan: " + this.umur);
    }
    
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama hewan: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan umur hewan: ");
        this.umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        scanner.close();
    }
}