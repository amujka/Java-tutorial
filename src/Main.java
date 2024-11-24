import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        libraryServices(library);

    }

    static void libraryServices(Library library) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose number:");
            System.out.println("1. Add new member, 2. Add new book, 3. Rent a book to Member 4. Return Book to library 5. Print library info to file, 6. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    library.addMemberToList();
                    break;
                case 2:
                    library.addBookToList();
                    break;
                case 3:
                    library.rentBook();
                    break;
                case 4:
                    library.returnBook();
                    break;
                case 5:
                    library.printLibraryInfoToFile();
                    break;
                case 6:
                    System.out.println("Exiting program");
                    return;
            }
        } while (true);
    }
}
