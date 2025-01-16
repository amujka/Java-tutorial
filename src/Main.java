import database.DatabaseService;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseService.createConnection();
        //addNewPerson(connection);
        //updateLastNameById(connection);
        deleteByDateOfBirth(connection);
    }

    static void addNewPerson(Connection connection) {
        List<Person> perosonList = new ArrayList<>();
        perosonList.add(new Person(1, "Ivo", "Ivic", "01-01-1960"));
        perosonList.add(new Person(2, "Ana", "Anic", "11-12-1964"));
        perosonList.add(new Person(3, "Miro", "Miric", "02-09-1999"));
        perosonList.add(new Person(4, "Marko", "Markic", "11-06-1990"));
        perosonList.add(new Person(5, "Slavko", "Slavic", "11-11-1989"));

        String query = "INSERT INTO Osoba(Ime,Prezime,DatumRodenja) VALUES(?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            for (Person person : perosonList) {
                preparedStatement.setString(1, person.getFirstName());
                preparedStatement.setString(2, person.getLastName());
                preparedStatement.setString(3, person.getDateOfBirth());
                preparedStatement.executeUpdate();
            }
            System.out.println("Success");
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void updateLastNameById(Connection connection) {
        try {
            String callProcedure = "{CALL UpdateLastName(?, ?)}";
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            callableStatement.setInt(1, 6);
            callableStatement.setString(2, "Slavkovski");
            callableStatement.execute();
            System.out.println("Last name updated");

            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    static void deleteByDateOfBirth(Connection connection) {
        try {
            String callProcedure = "{CALL DeleteByDateOfBirth(?)}";
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            callableStatement.setString(1, "11-06-1990");
            callableStatement.execute();
            System.out.println("Success");

            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
