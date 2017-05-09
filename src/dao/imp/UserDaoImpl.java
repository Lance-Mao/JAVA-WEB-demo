package dao.imp;

import dao.UserDao;
import db.DB;
import pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by pc on 17-4-22.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int login(User user) throws Exception {
         Connection conn = DB.getConn();
        String sql = "INSERT INTO user VALUES('" + user.getUsername() + "','" + user.getPassword() + "')";

            PreparedStatement ps = conn.prepareStatement(sql);
            int count = ps.executeUpdate(sql);
            return count;
    }
}
