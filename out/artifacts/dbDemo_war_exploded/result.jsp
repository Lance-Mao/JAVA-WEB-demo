<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-9
  Time: 下午3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = (String) session.getAttribute("name");   //获取保存在session范围内的对象
    String solution = request.getParameter("address");     //获取用户输入最喜欢去的地方
%>

<form id="form1" name="form1" method="post" action="">
    <table width="28%" border="0">
        <tr>
            <td colspan="2">
                <div align="left">您的名字是</div>
            </td>
            <td width="51%"></td>
            <div align=""><%name%></div>
        </tr>

        <tr>
            <td>
                <label>
                    <div align="left">您最喜欢去的地方是：</div>
                </label>
            </td>
            <td>
                <div align="left"><%solution%></div>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
