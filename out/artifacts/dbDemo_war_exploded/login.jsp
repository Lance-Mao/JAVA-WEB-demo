<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-4-22
  Time: 下午1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册界面</title>
</head>
<body>
<div id="Login">
    <form action="/LoginServlet" method="post">
        <table>
    <tr>
        <td>帐号:<input type="text" name="username"></td>
    </tr>
    <tr>
        <td>密码:<input type="password" name="password"></td>
    </tr>
    <tr>
        <td><button type="submit">注册</button></td>
    </tr>
        </table>
    </form>
</div>
</body>
</html>
