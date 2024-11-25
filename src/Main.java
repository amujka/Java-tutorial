import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Mercedes", "C-Class", "ZG-1234-AM", "sedan", 5));
        vehicles.add(new Car("Volvo", "850", "DU-4321-MA", "caravan", 5));
        vehicles.add(new Car("Porsche", "718 Spyder RS", "KA-2143-AA", "convertible", 3));

        vehicles.add(new Truck("MAN", "eTGX", "RI-9876-AC", true, 9500));
        vehicles.add(new Truck("Mercedes", "Actros 4043", "ČK-6734-AB", false, 11946));
        printVehicleData(findVehicleByRegistration(vehicles, scanner));


    }

    static Vehicle findVehicleByRegistration(ArrayList<Vehicle> vehicles, Scanner scanner) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleInfo());
        }
        System.out.println("Enter registration:");
        String registration = scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegistration().equals(registration)) {
                return vehicle;
            }
        }
        return null;
    }

    static void printVehicleData(Vehicle vehicle) {
        try {
            System.out.println(vehicle.getVehicleInfo());
        } catch (NullPointerException e) {
            System.out.println("No vehicle found. Try again");
        }
    }

}
