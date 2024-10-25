import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. zadatak

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int selectedOption;

        do {
            System.out.println("\nPlease choose option:");
            System.out.println("1. Add contact, 2. Name search, 3. Number search, 4. Print all contacts, 5. Exit");
            selectedOption = scanner.nextInt();
            scanner.nextLine(); //clear scanner value

            switch (selectedOption){
                case 1:
                    addContact(scanner,names,phoneNumbers);
                    break;
                case 2:
                    searchByName(scanner,names,phoneNumbers);
                    break;
                case 3:
                    searchByNumber(scanner,names,phoneNumbers);
                    break;
                case 4:
                    printAllContacts(names,phoneNumbers);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Not an option");
            }
        } while (true);
    }

    static void addContact(Scanner scanner, ArrayList<String> names,ArrayList<String> phoneNumbers){
        System.out.println("Name: ");
        names.add(scanner.nextLine());
        System.out.println("Phone: ");
        phoneNumbers.add(scanner.nextLine());
    }

    static void searchByName(Scanner scanner, ArrayList<String> names,ArrayList<String> phoneNumbers){
        System.out.print("Enter contact's name: ");
        int indexOfName = names.indexOf(scanner.nextLine());

        if (indexOfName != -1){
            System.out.println(names.get(indexOfName) + ": " + phoneNumbers.get(indexOfName) );
        }else {
            System.out.println("Contact not found");
            searchByName(scanner,names,phoneNumbers);
        }
    }

    static void searchByNumber(Scanner scanner, ArrayList<String> names,ArrayList<String> phoneNumbers){
        System.out.print("Enter contact's phone: ");
        int indexOfName = phoneNumbers.indexOf(scanner.nextLine());

        if (indexOfName != -1){
            System.out.println(names.get(indexOfName) + ": " + phoneNumbers.get(indexOfName) );
        }else {
            System.out.println("Contact not found");
            searchByNumber(scanner,names,phoneNumbers);
        }
    }

    static void printAllContacts(ArrayList<String> names,ArrayList<String> phoneNumbers){
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + phoneNumbers.get(i) );
        }
    }
}
