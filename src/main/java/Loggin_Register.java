
import java.sql.*;

public class Loggin_Register {
    public static void main(String[] args) {

        Loggin_Register loggin_register = new Loggin_Register();
        //loggin_register.login();
        loggin_register.createUserTable();
    }

    private String URL = "jdbc:mysql://localhost:3306/?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String USER = "root";
    private String PASSWORD = "av23@h11";

    void createDataBase () {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute("CREATE IF NOT EXISTS DATABASE WorkBase");
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    void createUserTable () {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS `workbase`.`login_register` (login VARCHAR (200) PRIMARY KEY, password VARCHAR (200))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void saveWorkerToDAO (Worker worker) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `workbase`.`login_register`.`login`(?,?)");
            preparedStatement.setString(0,worker.getUser());
            preparedStatement.setString(1,worker.getPassword());
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
