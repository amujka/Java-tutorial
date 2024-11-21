import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company("Microsoft");
        createAndAddEmployee(company, scanner);
        company.printEmployees();
        System.out.println("Biggest salary has employee " + company.findBiggestSalary());

    }

    static void createAndAddEmployee(Company company, Scanner scanner) throws Exception {
        int count = 0;
        do {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) throw new NoEmployeeFullNameException("First name is required");

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            if (lastName.isEmpty()) throw new NoEmployeeFullNameException("Last name is required");

            System.out.println("Enter salary:");
            double salary = scanner.nextDouble();
            if (salary <= 0) throw new InvalidSalaryException("Salary must be larger than 0");

            company.addEmployee(new Employee(firstName, lastName, salary));
            System.out.println("New employee was added\n");
            scanner.nextLine();
            count++;
        } while (count < 3);
    }
}
