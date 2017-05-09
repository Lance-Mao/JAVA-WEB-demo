package db;

import pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by pc on 17-4-22.
 */
public class DBInsert {
    public static void insert(User user){
        PreparedStatement statement = null;
        Connection conn = DB.getConn();
        String sql = "insert into user values('"+user.getUsername()+"','"+user.getPassword()+"')";
        try {
            statement = conn.prepareStatement(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
