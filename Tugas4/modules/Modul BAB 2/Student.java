
public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double Average;
    private static int count = 0;

    //awalnya public student
    public Student(){
        name = "";
        address = "";
        age = 0;
        count++;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        count++;
    }

    public Student(String n, String a, int ag, double mtk, double big, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = mtk;
        englishGrade = big;
        scienceGrade = science;
        count++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    public boolean statusAkhir(){
        return Average >= 61;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        //yang awalnya adalah get average
        System.out.println("mempunyai nilai rata rata"+ Average);
        System.out.println("Status :" + (statusAkhir() ? "Lolos" : "Remidi"));
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah Objek siswa yang dibuat: " + count);
    }
}
