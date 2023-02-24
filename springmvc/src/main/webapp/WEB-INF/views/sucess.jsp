<%--
  Created by IntelliJ IDEA.
  User: reeteshkesarwani
  Date: 2/24/23
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container" align="center">
    <h1>${Header}</h1>
    <h3>${Desc}</h3>
    <h1>${success}</h1>
</div>

<h1>Name of user is = ${user.name}</h1>

<h1>Name of Email is = ${user.email}</h1>

<h1>Name of password is = ${user.password}</h1>



</body>
</html>
