package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pc on 17-4-22.
 */
public class DB {
    private static Connection conn = null;
    public static Connection getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(url,username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn != null) {
            System.out.println("aaaaa");
        }
        return conn;
    }

    public static void closeConn(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   /* public static void main(String args[]) {
        DB db = new DB();
        db.getConn();
    }*/
}
