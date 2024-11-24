import java.util.ArrayList;

public class Member {
    private static int idCounter = 1;
    private final String firstName;
    private final String lastName;
    private final ArrayList<Book> rentedBooks;
    private int memberId = 0;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = idCounter++;
        rentedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public void rentBookToMember(Book book) {
        this.rentedBooks.add(book);
    }

    public void returnBookToLibrary(Book book) {
        this.rentedBooks.remove(book);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean hasBooks() {
        return !this.rentedBooks.isEmpty();
    }

    public ArrayList<Book> getRentedBooks() {
        return rentedBooks;
    }

    @Override
    public String toString() {
        String memberInfo = "ID: " + this.memberId + ", " + this.firstName + " " + this.lastName;

        if (this.rentedBooks.isEmpty()) {
            return memberInfo.concat(", No books rented");
        } else {
            return memberInfo.concat(" " + this.rentedBooks);
        }
    }
}
