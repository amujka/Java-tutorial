public class Student {
    private final String firstName;
    private final String lastName;
    private final String studentIndexNumber;
    private final double averageGrade;

    public Student(String firstName, String lastName, String studentIndexNumber, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndexNumber = studentIndexNumber;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getStudentIndexNumber() {
        return this.studentIndexNumber;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public String studentInfo() {
        return this.firstName + " " + this.lastName + " (Index: " + this.studentIndexNumber + ") - Avg Grade: " + this.averageGrade;
    }
}
