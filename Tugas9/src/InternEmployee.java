public class InternEmployee extends Employee implements Contract {
    private String universityName;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String universityName) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.universityName = universityName;
    }

    @Override
    public String getEmployeeType() {
        return "Karyawan Magang";
    }

    public String getUniversityName() {
        return universityName;
    }

    public void submitInternshipReport() {
        System.out.println(getName() + " dari " + universityName + " sedang menyerahkan laporan magang.");
    }

    public void attendUniversityCourses() {
        System.out.println(getName() + " sedang mengikuti kursus di " + universityName);
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " sedang menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println(getName() + "'s durasi magang sedang dilacak.");
    }
}
