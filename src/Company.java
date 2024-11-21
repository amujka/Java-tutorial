import java.util.ArrayList;

public class Company {
    private final String name;
    private final ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void printEmployees() {
        System.out.println(this.employees);
    }


    public Employee findBiggestSalary() {
        Employee biggestSalaryEmployee = employees.get(0);

        for (Employee employee : this.employees) {
            if (employee.getSalary() > biggestSalaryEmployee.getSalary()) {
                biggestSalaryEmployee = employee;
            }
        }
        return biggestSalaryEmployee;
    }
}
