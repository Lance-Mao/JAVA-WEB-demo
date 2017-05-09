package servlet;

import dao.UserDao;
import dao.imp.UserDaoImpl;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 17-4-22.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //System.out.println(username);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        UserDao userDao = new UserDaoImpl();
        try {
            userDao.login(user);
        } catch (Exception e) {

        }

        /*System.out.println(username +"2222");
        System.out.println(password);*/
       // DBInsert.insert(user);

    }

 /*   //往数据库插入数据
    public void insertDate() throws SQLException {
        Connection conn = DB.getConn();
        PreparedStatement ps = null;  //用于插入数据,执行动态的sql语句
        //sql语句,向user表中插入username和password的值
        //Statement sql = conn.createStatement();
        String insertstr ="insert into user(user,password) values(?,?)";

        ps.executeUpdate(insertstr);   //更新数据表
        ResultSet rs = ps.executeQuery("SELECT * FROM USER ");
        while (rs.next()) {
            String name = rs.getString(1);
            String password = rs.getString(2);
            System.out.println(name);
            System.out.println(password);
        }
    }
*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
