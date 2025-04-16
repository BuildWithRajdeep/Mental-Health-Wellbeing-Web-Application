package Backend;
import java.sql.*;
public class ConnectServlet {
    public static Connection connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/mental_health_app";
        String user = "root";
        String password = "your_password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}