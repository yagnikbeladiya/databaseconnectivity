
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {
    public static Connection1 getConnection() {
        Connection1 conn = null;
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "system";
            String password = "12345";
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}

