import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        addStudent();
    }

    static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();

        do {
            System.out.println("Please enter student first name");
            String firstName = scanner.nextLine();

            System.out.println("Please enter student last name");
            String lastName = scanner.nextLine();

            System.out.println("Please enter student email");
            String email = scanner.nextLine();
            if (students.containsKey(email)) {
                System.out.println("Email already exists.\n");
                break;
            }
            students.put(email, new Student(firstName, lastName, email));
            students.forEach((key, value) -> {
                System.out.println(key + "=" + value);
            });
        } while (true);
    }
}
