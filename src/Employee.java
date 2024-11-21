public class Employee {
    private final String firstName;
    private final String lastName;
    private final double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", salary: $" + this.salary + "\n";
    }
}
