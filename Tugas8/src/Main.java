public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiHarian("Yono Bakrie", "1234567890", 50, 45);
        Pegawai pegawai2 = new PegawaiTetap("Aan Android", "0987654321", 5000000);
        Pegawai pegawai3 = new Sales("Kak Gem", "1357924680", 100, 50000);

        // Polimorfisme
        System.out.println("Data Pegawai:");
        System.out.println("==============");
        System.out.println("1. Pegawai Harian:");
        System.out.println(pegawai1);
        System.out.println();

        System.out.println("2. Pegawai Tetap:");
        System.out.println(pegawai2);
        System.out.println();

        System.out.println("3. Pegawai Sales:");
        System.out.println(pegawai3);
        System.out.println();

        // Upcasting/Downcasting
        System.out.println("======================");
        PegawaiHarian ph = (PegawaiHarian) pegawai1;
        System.out.println("Upah per jam: Rp " + ph.getUpahPerjam());
        System.out.println("Total Jam Kerja: " + ph.getTotalJam() + " jam");
        System.out.println();

        PegawaiTetap pt = (PegawaiTetap) pegawai2;
        System.out.println("Upah: Rp " + pt.getUpah());
    }
}
