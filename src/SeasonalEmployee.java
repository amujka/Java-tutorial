import java.math.BigDecimal;

public class SeasonalEmployee extends Employee {

    public SeasonalEmployee(String name, BigDecimal baseSalary, int workingHours, String type) {
        super(name, baseSalary, workingHours, type);
    }

    @Override
    public void calculateBonusSalary() {
        if (super.getWorkingHours() > 200) {
            BigDecimal salaryBonus = super.getBaseSalary().multiply(BigDecimal.valueOf(10.0 / 100));
            super.setBaseSalary(super.getBaseSalary().add(salaryBonus));
        }
    }

    @Override
    public void showEmployeeInfo() {
        String info = "Seasonal employee: " + super.getName() + ", salary: $" + super.getBaseSalary() + ", hours worked: " + super.getWorkingHours();
        if (super.getWorkingHours() > 200) System.out.println(info + ", bonus applied");
        else System.out.println(info + ", bonus NOT applied");
    }
}
