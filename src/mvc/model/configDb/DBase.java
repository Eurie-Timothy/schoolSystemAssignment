package mvc.model.configDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class DBase{
    private static final String URL = "jdbc:mysql://localhost:3306/schoolSystem";
    private static final String USER = "fush";
    private static final String PASSWORD = "Password123_";

    Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    Connection createConnection() throws SQLException {
        Connection conn = getConnection();
        System.out.println("Connected to MySQL successfully!");
        return conn;
    }


}


