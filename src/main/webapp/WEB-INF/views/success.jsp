<%--
  Created by IntelliJ IDEA.
  User: DW
  Date: 2019/9/8
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<body>
    <a href="${APP_PATH}/getError">测试</a>
</body>
</html>
