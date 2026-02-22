import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/schoolSystem";
    private static final String USER = "fush";
    private static final String PASSWORD = "Password123_";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Connected to MySQL successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}