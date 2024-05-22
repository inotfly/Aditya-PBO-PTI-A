import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis objek yang ingin dibuat:");
        System.out.println("1. Manusia");
        System.out.println("2. Hewan");
        System.out.println("3. Tumbuhan");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Membuat objek Manusia
            Manusia manusia = new Manusia();
            manusia.inputInfo();

            // Menampilkan informasi Manusia
            manusia.tampilkanNama();
            manusia.tampilkanUmur();
            manusia.makan();
            manusia.berjalan();
            manusia.bersuara();

        } else if (pilihan == 2) {
            // Membuat objek Hewan
            Hewan hewan = new Hewan(null, pilihan);
            hewan.inputInfo();

            // Menampilkan informasi Hewan
            hewan.tampilkanNama();
            hewan.tampilkanUmur();
            hewan.makan();
            hewan.berjalan();
            hewan.bersuara();
            
        } else if (pilihan == 3) {
            // Membuat objek Tumbuhan
            Tumbuhan tumbuhan = new Tumbuhan("Serambi Lempit", 1000);
            tumbuhan.inputInfo();

            // Menampilkan informasi Tumbuhan
            tumbuhan.tampilkanNama();
            tumbuhan.tampilkanUmur();
            tumbuhan.makan();
            tumbuhan.berjalan();
            tumbuhan.bersuara();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
