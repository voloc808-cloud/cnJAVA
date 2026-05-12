package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/qlsinhvien";
            String user = "root";
            String password = "123456";

            Connection conn = DriverManager.getConnection(url, user, password);

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}