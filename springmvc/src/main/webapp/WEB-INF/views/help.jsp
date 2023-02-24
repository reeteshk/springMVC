<%--
  Created by IntelliJ IDEA.
  User: reeteshkesarwani
  Date: 2/24/23
  Time: 7:51 AM
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
<h1>This is help page</h1>
<h2><%=(String)request.getAttribute("name")%></h2>
<h2>${marks}</h2>
<hr>

<c:forEach  var="item" items="${marks}" varStatus="loop">
<h1>${item}</h1>
</c:forEach>
</body>
</html>
