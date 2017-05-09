<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-9
  Time: 下午3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    session.setAttribute("name", name);
%>

<div align="center">
    <form id="form1" name="form1" method="post" action="result.jsp">
        <table width="28%" border="0">
            <tr>
                <td>
                    您的名字是：
                </td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>你最喜欢去的地方是：</td>
                <td>
                    <label>
                        <input type="text" name="address"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <label>
                        <div align="center">
                            <input type="submit" name="Submit" value="提交">
                        </div>
                    </label>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
