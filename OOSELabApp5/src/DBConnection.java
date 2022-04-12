
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection connection;
    private static DBConnection obj;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (obj == null) {
            obj = new DBConnection();
        }
        return obj;
    }

    public Connection getConnection() {
        if (this.connection == null) {

            try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "12345");
                System.out.println("başarılı");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
