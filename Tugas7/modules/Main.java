import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate sekarang = LocalDate.now();
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, LocalDate.of(1999, 6, 21)); 
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, LocalDate.of(1990,9,21)); 
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, LocalDate.of(2000, 2, 2)); 
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, LocalDate.of(2004, 5, 3)); 
        WagesEMployee wages = new WagesEMployee("Mamad Racing", "999", 12.0, 1000, LocalDate.of(2004, 9, 21));

        Employee [] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee, wages};

        System.out.println("Gaji Polimorfisme:\n");

        for (Employee employee : employees){
            double earnings = employee.earnings();
            if (employee.getHariUlangTahun().getMonth() == sekarang.getMonth() && employee.getHariUlangTahun().getDayOfMonth() == sekarang.getDayOfMonth()){
                earnings += 100000;
            }

            System.out.println(employee);
            System.out.printf("Pendapatannya: $%,.2f\n\n", earnings);

        }

    }
}
