package nongsan.webmvc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {

    public connectDB() {
        super();
    }

    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "hr";
            String password = "1234";
            connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Kết nối thành công!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Kết nối thất bại!" + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(getConnect());
    }
}
