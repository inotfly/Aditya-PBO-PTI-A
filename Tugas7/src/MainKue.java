import java.util.Scanner;

public class MainKue {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] daftarKue = new Kue[20];
        int count = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Kue Pesanan");
            System.out.println("2. Tambah Kue Jadi");
            System.out.println("3. Tambah Kue Basi");
            System.out.println("4. Tampilkan Semua Kue");
            System.out.println("5. Total Harga Semua Kue");
            System.out.println("6. Total Harga dan Berat Kue Pesanan");
            System.out.println("7. Total Harga dan Jumlah Kue Jadi");
            System.out.println("8. Kue dengan Harga Terbesar");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline dari input sebelumnya

            switch (choice) {
                case 0:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                case 1:
                    if (count < 20) {
                        System.out.print("Masukkan nama kue pesanan: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan harga kue pesanan: ");
                        double harga = scanner.nextDouble();
                        System.out.print("Masukkan berat kue pesanan: ");
                        double berat = scanner.nextDouble();
                        daftarKue[count] = new kuePesanan(nama, harga, berat);
                        count++;
                        System.out.println("Kue pesanan berhasil ditambahkan.");
                    } else {
                        System.out.println("Maaf, jumlah maksimum kue telah tercapai.");
                    }
                    break;
                case 2:
                    if (count < 20) {
                        System.out.print("Masukkan nama kue jadi: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan harga kue jadi: ");
                        double harga = scanner.nextDouble();
                        System.out.print("Masukkan jumlah kue jadi: ");
                        double jumlah = scanner.nextDouble();
                        daftarKue[count] = new kueJadi(nama, harga, jumlah);
                        count++;
                        System.out.println("Kue jadi berhasil ditambahkan.");
                    } else {
                        System.out.println("Maaf, jumlah maksimum kue telah tercapai.");
                    }
                    break;
                case 3:
                    if (count < 20) {
                        System.out.print("Masukkan nama kue basi: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan harga kue basi: ");
                        double harga = scanner.nextDouble();
                        daftarKue[count] = new kueBasi(nama, harga, choice);
                        count++;
                        System.out.println("Kue basi berhasil ditambahkan.");
                    } else {
                        System.out.println("Maaf, jumlah maksimum kue telah tercapai.");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Kue:");
                    for (Kue kue : daftarKue) {
                        if (kue != null) {
                            System.out.println(kue);
                        }
                    }
                    break;
                case 5:
                    double totalHargaSemuaKue = 0;
                    for (Kue kue : daftarKue) {
                        if (kue != null) {
                            totalHargaSemuaKue += kue.hitungHarga();
                        }
                    }
                    System.out.println("Total harga semua kue: " + totalHargaSemuaKue);
                    break;
                case 6:
                    double totalHargaKuePesanan = 0;
                    double totalBeratKuePesanan = 0;
                    for (Kue kue : daftarKue) {
                        if (kue instanceof kuePesanan) {
                            totalHargaKuePesanan += kue.hitungHarga();
                            totalBeratKuePesanan += ((kuePesanan) kue).getBerat();
                        }
                    }
                    System.out.println("Total harga KuePesanan: " + totalHargaKuePesanan);
                    System.out.println("Total berat KuePesanan: " + totalBeratKuePesanan);
                    break;
                case 7:
                    double totalHargaKueJadi = 0;
                    double totalJumlahKueJadi = 0;
                    for (Kue kue : daftarKue) {
                        if (kue instanceof kueJadi) {
                            totalHargaKueJadi += kue.hitungHarga();
                            totalJumlahKueJadi += ((kueJadi) kue).getJumlah();
                        }
                    }
                    System.out.println("Total harga KueJadi: " + totalHargaKueJadi);
                    System.out.println("Total jumlah KueJadi: " + totalJumlahKueJadi);
                    break;
                case 8:
                    double hargaTerbesar = 0;
                    Kue kueTerbesar = null;
                    for (Kue kue : daftarKue) {
                        if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                            hargaTerbesar = kue.hitungHarga();
                            kueTerbesar = kue;
                        }
                    }
                    if (kueTerbesar != null) {
                        System.out.println("Kue dengan harga terbesar: " + kueTerbesar);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        }
    }
}