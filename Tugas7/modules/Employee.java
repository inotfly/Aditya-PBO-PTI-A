import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate hariUlangTahun;

    public Employee(String name, String noKTP, LocalDate hariUlangTahun) {
        this.name = name;
        this.noKTP = noKTP;
        this.hariUlangTahun = hariUlangTahun;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getHariUlangTahun() {
        return hariUlangTahun;
    }

    public void setHariUlangTahun() {
        this.hariUlangTahun = hariUlangTahun;
    }

    public String toString() {
        return String.format(" " + getName() + "\nNo. KTP :" + getNoKTP() + "\nUlangTahun: " + getHariUlangTahun());
    }

    public abstract double earnings();// pendapatan
}