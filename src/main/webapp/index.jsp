<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<body>
    <div style="width: 100%" align="center">
        <form method="post" action="${APP_PATH}/getUser">
            <table>
                <tbody>
                    <tr>
                        <td><p>用户名：</p></td>
                        <td><input type="text" id="username" name="username"/></td>
                    </tr>
                    <tr>
                        <td><p>密码：</p></td>
                        <td><input type="passward" id="passward" name="passward"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="登录">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </div>
</body>
</html>
