<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/18
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Page Redirection</title>
</head>
<body>
<h2>Spring Page Redirection</h2>
<p>Click below button to redirect the result to new page</p>
<form:form method="get" action="/HelloWeb/redirect">
    <table>
        <tr>
            <td>
                <input type="submit" value="Redirect Page"/>
            </td>
        </tr>
    </table>
</form:form>


<br>
<h2>Spring Landing Pag</h2>
<h3><!--处理请求至静态页面的请求:https://www.w3cschool.cn/wkspring/zlmb1mmo.html--></h3>
<p>Click below button to get a simple HTML page</p>
<form:form method="GET" action="/HelloWeb/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="Get HTML Page"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
