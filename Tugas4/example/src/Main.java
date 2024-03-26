public class Main {
    public static void main(String[] args) {
        // Membuat objek pesawat menggunakan constructor overloading
        Pesawat pesawat1 = new Pesawat();
        Pesawat pesawat2 = new Pesawat("boing 998", 999, "Ngurah Rai", "Bali", "Jakarta");
        Pesawat pesawat3 = new Pesawat(300);        
        Pesawat pesawat4 = new Pesawat("Juanda Soekarno");

        // sett sendiri peswat 1
        pesawat2.terbang();
        pesawat2.terbang("07.00");
        pesawat2.terbang(350);

        // Menampilkan informasi pesawat
        pesawat2.printList();
    }
}
