
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        Student chris = new Student();
        Student david = new Student();

        Student.jumlahObjek();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        // mamad
        Student mamad = new Student("Mamad", "Bandung", 99, 10, 98, 79);
        mamad.displayMessage();

        // array
        Scanner sc = new Scanner(System.in);
        int jumlahSiswa = sc.nextInt();
        Student[] siswa = new Student[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Alamat: ");
            String alamat = sc.nextLine();

            System.out.print("Umur: ");
            int umur = sc.nextInt();
            sc.nextLine();

            System.out.print("Nilai Matematika: ");
            double nilaimate = sc.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double nilaieng = sc.nextDouble();

            System.out.print("Nilai IPA: ");
            double nilaiipa = sc.nextDouble();
            sc.nextLine();

            siswa[i] = new Student(nama, alamat, umur, nilaimate, nilaieng, nilaiipa);
        }
    }
}
