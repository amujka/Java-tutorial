import database.DatabaseService;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DatabaseService.createConnection();

        while (true) {
            System.out.println("Choose number:");
            System.out.println("1.Create new city 2.Update city 3.Delete city 4.Show cities 5.Exit");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    createCity(scanner, connection);
                    break;
                case "2":
                    updateCity(scanner, connection);
                    break;
                case "3":
                    deleteCity(scanner, connection);
                    break;
                case "4":
                    showCities(connection);
                    break;
                case "5":
                    System.out.println("Exiting the program");
                    connection.close();
                    return;
            }

        }
    }

    static void createCity(Scanner scanner, Connection connection) {

        try {
            String countryQuery = "SELECT * FROM Drzava"; // Zamijenite stvarnim nazivom tablice
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(countryQuery);

            System.out.print("Select country ID: ");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("IDDrzava") + ":" + resultSet.getString("Naziv") + ", ");
            }
            System.out.println("\n");

            String countryID = scanner.nextLine();

            System.out.println("Enter city name:");
            String cityName = scanner.nextLine();

            String query = "INSERT INTO Grad(Naziv,DrzavaID) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, cityName);
            preparedStatement.setString(2, countryID);

            preparedStatement.executeUpdate();
            System.out.println("New City is added");

            // Zatvaranje resursa
            statement.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void updateCity(Scanner scanner, Connection connection) {
        try {
            System.out.println("Select city ID:");
            String citiesQuery = "SELECT * FROM Grad"; // Zamijenite stvarnim nazivom tablice
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(citiesQuery);

            System.out.print("Select country ID: ");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("IDGrad") + ":" + resultSet.getString("Naziv") + ", ");
            }
            System.out.println("\n");
            String cityId = scanner.nextLine();
            System.out.println("Enter new city name:");
            String updatedCityNme = scanner.nextLine();

            String query = "UPDATE Grad SET Naziv = ? WHERE IDGrad = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, updatedCityNme);
            preparedStatement.setString(2, cityId);

            preparedStatement.executeUpdate();

            System.out.println("City name is updated");
            statement.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteCity(Scanner scanner, Connection connection) {
        try {
            System.out.println("Enter city name:");
            String cityName = scanner.nextLine();
            // Izvršavanje SQL upita
            String query = "DELETE FROM Grad WHERE Naziv = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, cityName);

            statement.executeUpdate();

            System.out.println("City removed");

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showCities(Connection connection) {
        try {
            // Izvršavanje SQL upita
            String query = "SELECT Naziv FROM Grad ORDER BY Naziv"; // Zamijenite stvarnim nazivom tablice
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Ispis rezultata
            int cityCount = 0;
            while (resultSet.next()) {
                cityCount++;
                System.out.print(resultSet.getString("Naziv") + ", ");
                if (cityCount % 10 == 0) System.out.print("\n");
            }
            System.out.print("\n");

            // Zatvaranje resursa
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
