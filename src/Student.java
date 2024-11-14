public class Student {
    private final String firstName;
    private final String lastName;
    private final int jmbag;

    public Student(String firstName, String lastName, int jmbag) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jmbag = jmbag;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + ", JMBAG: " + jmbag;
    }
}
