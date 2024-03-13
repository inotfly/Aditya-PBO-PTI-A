import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Penulis {
    String nama;
    int tahunLahir;

    Penulis(String nama, int tahunLahir) {
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }
}

class Buku {
    String judul;
    Penulis penulis;

    Buku(String judul, Penulis penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

class KategoriBuku {
    String namaKategori;
    List<Buku> daftarBuku;

    KategoriBuku(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBuku = new ArrayList<>();
    }

    void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}

public class Perpustakaan {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna untuk login
        System.out.println("Masukkan username dan password untuk login:");
        System.out.print("Username: ");
        String usernameInput = sc.nextLine();
        System.out.print("Password: ");
        String passwordInput = sc.nextLine();

        // Memeriksa apakah login berhasil
        if (!loginVal(usernameInput, passwordInput)) {
            System.out.println("Username atau password salah. Aplikasi berhenti.");
            System.exit(0);
        }

        // Inisialisasi penulis
        Penulis penulis1 = new Penulis("John Doe", 1980);
        Penulis penulis2 = new Penulis("Jane Smith", 1990);
        Penulis penulis3 = new Penulis("Rahmat Sidede", 2000);
        Penulis penulis4 = new Penulis("Arip Dribble", 2010);
        Penulis penulis5 = new Penulis("Granger Pranowo", 2030);
        Penulis penulis6 = new Penulis("Latep Kiddrock", 2040);
        Penulis penulis7 = new Penulis("Mamat Purnama", 2050);
        // Inisialisasi buku
        Buku buku1 = new Buku("Pemrograman Java", penulis1);
        Buku buku2 = new Buku("Filsafat Hidup", penulis2);
        Buku buku3 = new Buku("Sejarah Dunia", penulis3);
        Buku buku4 = new Buku("Psikologi Kognitif", penulis4);
        Buku buku5 = new Buku("Politik Modern", penulis5);
        Buku buku6 = new Buku("Agamaku Agamamu", penulis6);
        Buku buku7 = new Buku("Fiksi Itu Gaul", penulis7);

        // Inisialisasi kategori buku beserta bukunya
        KategoriBuku teknologi = new KategoriBuku("Teknologi");
        teknologi.tambahBuku(buku1);
        teknologi.tambahBuku(new Buku("Teknologi Ikan Ternak", penulis1));
        teknologi.tambahBuku(new Buku("Ai Pembuat Meme", penulis2));
        teknologi.tambahBuku(new Buku("Lalapan VR", penulis3));
        teknologi.tambahBuku(new Buku("Produksi Pakan Virtual", penulis4));

        // filsafat
        KategoriBuku filsafat = new KategoriBuku("Filsafat");
        filsafat.tambahBuku(buku2);
        filsafat.tambahBuku(new Buku("Etika Hidup", penulis1));
        filsafat.tambahBuku(new Buku("Pemikiran Kritis", penulis2));
        filsafat.tambahBuku(new Buku("Metafisika", penulis3));
        filsafat.tambahBuku(new Buku("Logika Filosofis", penulis4));

        // sejarah
        KategoriBuku sejarah = new KategoriBuku("Sejarah");
        sejarah.tambahBuku(buku3);
        sejarah.tambahBuku(new Buku("Perang Dunia II", penulis1));
        sejarah.tambahBuku(new Buku("Peradaban Kuno", penulis2));
        sejarah.tambahBuku(new Buku("Revolusi Industri", penulis3));
        sejarah.tambahBuku(new Buku("Sejarah Asia", penulis4));

        // psikologi
        KategoriBuku psikologi = new KategoriBuku("Psikologi");
        psikologi.tambahBuku(buku4);
        psikologi.tambahBuku(new Buku("Psikologi Abnormal", penulis1));
        psikologi.tambahBuku(new Buku("Kepribadian", penulis2));
        psikologi.tambahBuku(new Buku("Psikologi Sosial", penulis3));
        psikologi.tambahBuku(new Buku("Neuropsikologi", penulis4));

        // politik
        KategoriBuku politik = new KategoriBuku("Politik");
        politik.tambahBuku(buku5);
        politik.tambahBuku(new Buku("Sistem Politik", penulis1));
        politik.tambahBuku(new Buku("Teori Politik", penulis2));
        politik.tambahBuku(new Buku("Politik Global", penulis3));
        politik.tambahBuku(new Buku("Partai Politik", penulis4));

        // agama
        KategoriBuku agama = new KategoriBuku("Agama");
        agama.tambahBuku(buku6);
        agama.tambahBuku(new Buku("Akidah Islam", penulis1));
        agama.tambahBuku(new Buku("Fiqih", penulis2));
        agama.tambahBuku(new Buku("Keutamaan Sholat", penulis3));
        agama.tambahBuku(new Buku("Buah Khuldi", penulis4));

        // FIKSI
        KategoriBuku fiksi = new KategoriBuku("Fiksi");
        fiksi.tambahBuku(buku7);
        fiksi.tambahBuku(new Buku("Aku yang Cacad", penulis1));
        fiksi.tambahBuku(new Buku("Aku yang Cacad", penulis2));
        fiksi.tambahBuku(new Buku("Aku yang Cacad", penulis3));
        fiksi.tambahBuku(new Buku("Aku yang Cacad", penulis4));

        // Daftar semua kategori buku
        KategoriBuku[] kategoriBuku = { teknologi, filsafat, sejarah, psikologi, politik, agama, fiksi };

        // Menampilkan pilihan kategori buku
        System.out.println("Pilih kategori buku (1-7): ");
        for (int i = 0; i < kategoriBuku.length; i++) {
            System.out.println((i + 1) + ". " + kategoriBuku[i].namaKategori);
        }

        Scanner scanner = new Scanner(System.in);

        // Memilih kategori buku
        System.out.print("Masukkan nomor kategori: ");
        int pilihanKategori = scanner.nextInt();

        // Memastikan nomor kategori valid
        if (pilihanKategori < 1 || pilihanKategori > kategoriBuku.length) {
            System.out.println("Pilihan kategori tidak valid.");
            System.exit(0);
        }

        KategoriBuku kategoriPilihan = kategoriBuku[pilihanKategori - 1];

        // Menampilkan buku dalam kategori yang dipilih
        System.out.println("Buku dalam kategori " + kategoriPilihan.namaKategori + ":");
        for (Buku buku : kategoriPilihan.daftarBuku) {
            System.out.println("Judul: " + buku.judul + ", Penulis: " + buku.penulis.nama);
        }

        scanner.close();
    }
    private static boolean loginVal(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}
