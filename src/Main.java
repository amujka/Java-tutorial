import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.zadatak
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        addStudent(scanner, studentList);
        getHighestAvgStudent(studentList);
        getLowestAvgStudent(studentList);
        getAllAverages(studentList);

    }

    private static void addStudent(Scanner scanner, ArrayList<Student> studentList) {
        int selectedOption;
        do {
            System.out.println("Enter 1) Add student, 2) Exit");
            selectedOption = scanner.nextInt();

            if (selectedOption == 2) break;
            scanner.nextLine();

            System.out.println("Enter student data in 1 line with space separated");
            String[] studentData = scanner.nextLine().split(" ");

            studentList.add(new Student(studentData[0], studentData[1], studentData[2], Double.parseDouble(studentData[3])));

            System.out.println("New student added\n");
        } while (true);

        for (Student student : studentList) {
            System.out.println(student.studentInfo());
        }
    }

    private static void getHighestAvgStudent(ArrayList<Student> studentList) {
        double higherAvgScore = studentList.get(0).getAverageGrade();
        int listIndex = 0;
        for (int i = 1; i < studentList.size(); i++) {
            if (higherAvgScore < studentList.get(i).getAverageGrade()) {
                higherAvgScore = studentList.get(i).getAverageGrade();
                listIndex = i;
            }
        }
        System.out.println("\nStudent with highest average is: " + studentList.get(listIndex).studentInfo());
    }

    private static void getLowestAvgStudent(ArrayList<Student> studentList) {
        double lowerAvgScore = studentList.get(0).getAverageGrade();
        int listIndex = 0;
        for (int i = 1; i < studentList.size(); i++) {
            if (lowerAvgScore > studentList.get(i).getAverageGrade()) {
                lowerAvgScore = studentList.get(i).getAverageGrade();
                listIndex = i;
            }
        }
        System.out.println("\nStudent with lowest average is: " + studentList.get(listIndex).studentInfo());
    }

    private static void getAllAverages(ArrayList<Student> arrayList) {
        for (Student student : arrayList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + "-" + student.getAverageGrade());
        }
    }
}
