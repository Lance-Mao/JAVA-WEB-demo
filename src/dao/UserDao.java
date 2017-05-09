package dao;

import pojo.User;

/**
 * Created by pc on 17-4-22.
 */
public interface UserDao {
    /**
     * login
     */
    int login(User user) throws Exception;


}
