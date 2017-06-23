package uet.vnu.java.spring.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
	
	private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tododb", "root", "");
            } catch (SQLException e) {
                System.out.println("Connect Failed");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
