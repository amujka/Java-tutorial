public class Student {
    private final String firstName;
    private final String lastName;
    private final String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "[" + this.firstName + " " + this.lastName + ", " + this.email + "]";
    }
}
