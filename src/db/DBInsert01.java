package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by pc on 17-4-22.
 */
public class DBInsert01 {
    public static void main(String args[]) {
        Connection conn = DB.getConn();
        try {
            Statement statement = conn.createStatement();
            String sql = "insert into user values('aaaa','bbbb')";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
