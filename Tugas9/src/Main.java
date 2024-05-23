public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Mad", 2, 50000);
        Invoice invoice2 = new Invoice("Pen", 10, 2000);
        Invoice[] invoices = {invoice1, invoice2};

        PermanentEmployee permanentEmployee = new PermanentEmployee(123, "Rahmat", 5000000, invoices, "Standard Pension Scheme");
        InternEmployee internEmployee = new InternEmployee(456, "Racing", 3000000, invoices, "XYZ University");

        // Calling methods for PermanentEmployee
        System.out.println(permanentEmployee.getDetails());
        System.out.println("Tipe Pegawai : " + permanentEmployee.getEmployeeType());
        permanentEmployee.participateInPensionPlan();
        permanentEmployee.applyForLeave();
        System.out.println("Bonus: " + permanentEmployee.calculateBonus());
        Employee.staticEmployeeInfo();

        // Calling methods for InternEmployee
        System.out.println(internEmployee.getDetails());
        System.out.println("Tipe Pegawai : " + internEmployee.getEmployeeType());
        internEmployee.submitInternshipReport();
        internEmployee.attendUniversityCourses();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        System.out.println("Bonus: " + internEmployee.calculateBonus());
        Employee.staticEmployeeInfo();
    }
}
