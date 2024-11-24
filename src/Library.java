import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library implements BookService {
    private final ArrayList<Book> availableBooks;
    private final ArrayList<Member> members;

    public Library() {
        members = new ArrayList<>();
        availableBooks = new ArrayList<>();
        //metode za dodavanje predefiniranih clanova da olaksa testiranje
        prepopulateMemberList();
        prepopulateBookList();
    }

    @Override
    public void addBookToList() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose number:");
            System.out.println("1. Enter a new book, 2. Return");
            int option = scanner.nextInt();
            if (option == 2) break;
            scanner.nextLine();
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter book author:");
            String author = scanner.nextLine();

            availableBooks.add(new Book(title, author));
            System.out.println("New book added\n");
        } while (true);
    }

    @Override
    public void addMemberToList() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Choose number:");
                System.out.println("1. Enter a new member, 2. Return");
                int option = scanner.nextInt();
                if (option == 2) break;
                scanner.nextLine();
                System.out.println("Enter member first name:");
                String firstName = scanner.nextLine();
                System.out.println("Enter member last name:");
                String lastName = scanner.nextLine();

                members.add(new Member(firstName, lastName));
                System.out.println("New member added\n");
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Please try again");
                scanner.nextLine();
                addMemberToList();
            }
        } while (true);
    }

    @Override
    public void rentBook() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose number:");
            System.out.println("1. Select a member, 2. Return");
            int option = scanner.nextInt();
            if (option == 2) break;
            System.out.println("Select member by ID:");
            for (Member member : members) {
                System.out.print(member.getMemberId() + ") " + member.getFullName() + ", ");
            }
            System.out.println("\n");
            int memberId = scanner.nextInt();
            Member member = members.get(memberId - 1);

            System.out.println("Select book by ID");
            for (Book book : availableBooks) {
                System.out.print(book.getId() + ") " + book.getTitle() + ", ");
            }
            System.out.println("\n");
            int bookId = scanner.nextInt();
            try {
                Book book = findBookById(bookId, this.availableBooks);
                member.rentBookToMember(book);
                availableBooks.remove(book);
                System.out.println(book.getTitle() + " added to " + member.getFullName());

            } catch (NullPointerException e) {
                System.out.println("Book is not available\n");
            }
        } while (true);
    }

    @Override
    public void returnBook() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose number:");
            System.out.println("1. Select a member, 2. Return");
            int option = scanner.nextInt();
            if (option == 2) break;
            System.out.println("Select member by ID:");
            for (Member member : members) {
                if (member.hasBooks()) {
                    System.out.print(member.getMemberId() + ") " + member.getFullName() + ", ");
                }
            }
            System.out.println("\n");
            int memberId = scanner.nextInt();
            Member member = members.get(memberId - 1);

            System.out.println("Select book by ID");
            for (Book book : member.getRentedBooks()) {
                System.out.print(book.getId() + ") " + book.getTitle() + ", ");
            }
            System.out.println("\n");
            int bookId = scanner.nextInt();
            try {
                Book book = findBookById(bookId, member.getRentedBooks());
                member.returnBookToLibrary(book);
                availableBooks.add(book);
                System.out.println(book.getTitle() + " returned to library");

            } catch (NullPointerException e) {
                System.out.println("Book is not available\n");
            }
        } while (true);
    }

    public void printLibraryInfoToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("library.txt"))) {
            writer.println("LIBRARY INFO:\n");

            writer.println("Books List:");
            for (Book book : availableBooks) {
                writer.println(book);
            }
            writer.println();
            writer.println("Members List:");
            for (Member member : members) {
                writer.println(member);
            }
            System.out.println("Data has been written to library.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file." + e.getMessage());
        }
    }

    private Book findBookById(int id, ArrayList<Book> books) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }

    //dodavanje predefiniranih članova u kniznicu da olakša testiranje
    private void prepopulateMemberList() {
        members.add(new Member("Tom", "Jones"));
        members.add(new Member("Sara", "Lee"));
        members.add(new Member("John", "Smith"));
        members.add(new Member("Amy", "Brown"));
        members.add(new Member("Mark", "Miller"));
        members.add(new Member("Anna", "Davis"));
        members.add(new Member("Paul", "White"));
        members.add(new Member("Jane", "Green"));
        members.add(new Member("Sam", "Clark"));
        members.add(new Member("Lisa", "Adams"));
    }

    //dodavanje predefiniranih knjiga u kniznicu da olakša testiranje
    private void prepopulateBookList() {
        availableBooks.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        availableBooks.add(new Book("1984", "George Orwell"));
        availableBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        availableBooks.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez"));
        availableBooks.add(new Book("Moby Dick", "Herman Melville"));
        availableBooks.add(new Book("War and Peace", "Leo Tolstoy"));
        availableBooks.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        availableBooks.add(new Book("Pride and Prejudice", "Jane Austen"));
        availableBooks.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        availableBooks.add(new Book("The Chronicles of Narnia", "C.S. Lewis"));
    }
}
