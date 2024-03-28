import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor rekening, nama, saldo awal, dan PIN
        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = scanner.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();

        Customer customer = new Customer(nomorRekening, nama, saldoAwal, pin);

        // Input jumlah pembelian
        System.out.print("Masukkan jumlah pembelian: ");
        double jumlahPembelian = scanner.nextDouble();

        // Lakukan pembelian
        customer.pembelian(jumlahPembelian);

        scanner.close();
    }
}
