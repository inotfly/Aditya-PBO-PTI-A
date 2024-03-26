public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        pembilang /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    // oprator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    // operator Unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    // operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    // Operator <
    public boolean lessThan(Rasional kurangDari) {
        return (pembilang * kurangDari.penyebut < penyebut * kurangDari.pembilang);
    }

    // Operator <=
    public boolean lessThanOrEqual(Rasional kurangSama) {
        return (pembilang * kurangSama.penyebut <= penyebut * kurangSama.pembilang);
    }

    // Operator >=
    public boolean greaterThanOrEqual(Rasional besarSama) {
        return (pembilang * besarSama.penyebut >= penyebut * besarSama.pembilang);
    }

    // Operator -
    public Rasional subtract(Rasional o) {
        int newPembilang = pembilang * o.penyebut - penyebut * other.pembilang;
        int newPenyebut = penyebut * o.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator *
    public Rasional multiply(Rasional p) {
        int newPembilang = pembilang * p.pembilang;
        int newPenyebut = penyebut * p.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator /
    public Rasional divide(Rasional q) {
        if (q.pembilang == 0) {
            throw new IllegalArgumentException("Tidak bisa dibagi dengan nol.");
        }
        int newPembilang = pembilang * q.penyebut;
        int newPenyebut = penyebut * q.pembilang;
        return new Rasional(newPembilang, newPenyebut);
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}