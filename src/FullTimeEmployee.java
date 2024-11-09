import java.math.BigDecimal;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, BigDecimal baseSalary, int workingHours, String type) {
        super(name, baseSalary, workingHours, type);
    }

    @Override
    public void calculateBonusSalary() {
        if (super.getWorkingHours() > 160) {
            BigDecimal salaryBonus = super.getBaseSalary().multiply(BigDecimal.valueOf((15.0 / 100)));
            super.setBaseSalary(super.getBaseSalary().add(salaryBonus));
        }
    }

    @Override
    public void showEmployeeInfo() {
        String info = "Full-time employee: " + super.getName() + ", salary: $" + super.getBaseSalary() + ", hours worked: " + super.getWorkingHours();
        if (super.getWorkingHours() > 160) System.out.println(info + ", bonus applied");
        else System.out.println(info + ", bonus NOT applied");
    }
}