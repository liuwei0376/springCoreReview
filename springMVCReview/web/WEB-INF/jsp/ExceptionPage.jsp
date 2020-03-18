<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/18
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Exception Handling</title>
</head>
<body>
<h2>
    Spring MVC Exception Handling
</h2>
<!-- below the exception is instance ojbect of diy SpringException class which define at model package -->
<h3><font color="red">${exception.exceptionMsg}</font> </h3>
</body>
</html>
