import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    private final int workingHours;
    private final String type;
    private BigDecimal baseSalary;

    public Employee(String name, BigDecimal baseSalary, int workingHours, String type) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }
    
    public abstract void calculateBonusSalary();

    public abstract void showEmployeeInfo();

}
