import java.util.Scanner;

public class Tumbuhan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    // Konstruktor dengan parameter nama dan umur
    public Tumbuhan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Menyerap nutrisi dari tanah dan fotosintesis");
    }

    @Override
    public void berjalan() {
        System.out.println("Tidak berjalan, tetap berada pada tempat tumbuhnya");
    }

    @Override
    public void bersuara() {
        System.out.println("Tidak bersuara");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama tumbuhan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur tumbuhan: " + this.umur);
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama tumbuhan: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan umur tumbuhan: ");
        this.umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        scanner.close();
    }
}
