import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        addEmployee(scanner, employeeList);
        printEmployeeInfo(employeeList);

    }

    public static void addEmployee(Scanner scanner, ArrayList<Employee> employees) {
        String name;
        BigDecimal baseSalary;
        int workingHours;
        String type = "";

        do {
            System.out.println("Enter employee name or 1 for Exit:");
            name = scanner.nextLine();
            if (name.equals("1")) break;

            System.out.println("Enter base salary:");
            baseSalary = scanner.nextBigDecimal();

            System.out.println("Enter working hours:");
            workingHours = scanner.nextInt();

            System.out.println("Enter 1 for Full-time or enter 2 for Seasonal");
            int typeOption = scanner.nextInt();

            if (typeOption == 1) type = "full-time";
            else if (typeOption == 2) type = "seasonal";

            if (type.equals("full-time")) {
                employees.add(new FullTimeEmployee(name, baseSalary, workingHours, type));
            } else if (type.equals("seasonal")) {
                employees.add(new SeasonalEmployee(name, baseSalary, workingHours, type));
            }
            scanner.nextLine();
        } while (true);

        for (Employee employee : employees) {
            employee.calculateBonusSalary();
        }
    }

    public static void printEmployeeInfo(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            employee.showEmployeeInfo();
        }
    }

}
