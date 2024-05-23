public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalDebt = 0;
        for (Invoice invoice : invoices) {
            totalDebt += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalDebt;
    }

    public String getDetails() {
        StringBuilder invoiceDetails = new StringBuilder();
        for (Invoice invoice : invoices) {
            invoiceDetails.append(invoice.toString()).append("\n");
        }
        return "Employee{" +
                "registrationNumber =" + registrationNumber +
                ", nama ='" + name + '\'' +
                ", gaji per bulan =" + salaryPerMonth +
                ", total jumlah hutang =" + getPayableAmount() +
                '}' + "\nInvoices:\n" + invoiceDetails;
    }

    public double calculateBonus() {
        return salaryPerMonth * 0.10;
    }

    public static void staticEmployeeInfo() {
        System.out.println("Semua karyawan adalah bagian dari NV. Perusahaan Meneer.");
    }

    public abstract String getEmployeeType();

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }
}
