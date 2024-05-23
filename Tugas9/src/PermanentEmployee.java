public class PermanentEmployee extends Employee {
    private String pensionScheme;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String pensionScheme) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.pensionScheme = pensionScheme;
    }

    @Override
    public String getEmployeeType() {
        return "Pegawai Tetap.";
    }

    public String getPensionScheme() {
        return pensionScheme;
    }

    public void participateInPensionPlan() {
        System.out.println(getName() + " berpartisipasi dalam skema pensiun: " + pensionScheme);
    }

    public void applyForLeave() {
        System.out.println(getName() + " sedang cuti.");
    }
}
