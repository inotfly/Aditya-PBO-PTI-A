public class MainLingkaran {
    public static void main(String[] args) {
        lingkaran l = new lingkaran (3);
        l.setTinggi(100);
        
        l.displayMessage();

        lingkaran l2 = new lingkaran(3,4);
        
        l2.displayMessage();

        lingkaran baru = new lingkaran(6, 12);
        baru.displayMessage();
    }
}
