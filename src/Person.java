public class Person {
    private final int personId;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;

    public Person(int personId, String firstName, String lastName, String dateOfBirth) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
