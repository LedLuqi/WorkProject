import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Loggin_Register {
    public static void main(String[] args) {
        Loggin_Register loggin_register = new Loggin_Register();
        //loggin_register.login();
        loggin_register.create();
    }

    void login () {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "av23@h11");
            statement = connection.createStatement();
            statement.execute("CREATE IF NOT EXISTS DATABASE WorkBase");
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    void create () {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "av23@h11");
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS `workbase`.`work` (login VARCHAR (200) , password VARCHAR (200))");
            

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void register (String login, String password) {

    }
}
