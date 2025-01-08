import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        manageStudents();
        manageCities();
        manageEmployees();
    }

    static void manageStudents() {
        HashSet<String> students = new HashSet<>();
        students.add("Marko Maric");
        students.add("Ivo Ivic");
        students.add("Ana Anic");
        students.add("Alen Mujkanovic");
        students.add("Ivana Ivanic");

        if (students.contains("Ivo Ivic")) {
            System.out.println("Ivo Ivic postoji");
        } else {
            System.out.println("Ivo Ivic NE postoji");
        }
        System.out.println(students);
        students.remove("Ivo Ivic");
        System.out.println(students);
    }

    static void manageCities() {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Zagreb");
        cities.add("Sarajevo");
        cities.add("Ljubljana");
        cities.add("Beograd");

        System.out.println(cities);
        System.out.println("First city is " + cities.first());
        System.out.println("Last city is " + cities.last());
        cities.remove("Sarajevo");
        System.out.println(cities);
    }

    static void manageEmployees() {
        HashSet<String> employeesA = new HashSet<>();
        employeesA.add("Marko Maric");
        employeesA.add("Ivo Ivic");
        employeesA.add("Ana Anic");
        employeesA.add("Alen Mujkanovic");

        HashSet<String> employeesB = new HashSet<>();
        employeesB.add("Leon Leonic");
        employeesB.add("Dejan Dejanovic");
        employeesB.add("Mate Matic");
        employeesB.add("Alen Mujkanovic");

        System.out.println(employeesA);
        System.out.println(employeesB);

        for (String employee : employeesA) {
            if (employeesB.contains(employee)) {
                System.out.println(employee + " works in both departments");
            }
        }

        for (String employee : employeesA) {
            if (!employeesB.contains(employee)) {
                System.out.println(employee + " works ONLY in department A");
            }
        }
    }


}
