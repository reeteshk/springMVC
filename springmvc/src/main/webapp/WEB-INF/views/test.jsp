<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: reeteshkesarwani
  Date: 2/21/23
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World from Reetesh Kesarwani</h1>
<h1>Hello World from Reetesh Kesarwani</h1>
<h1>Hello World from Reetesh Kesarwani</h1>
<h1>Hello World from Reetesh Kesarwani</h1>
<h1>Name is Durgesh</h1>
<%
    String name=(String)request.getAttribute("name");
    ArrayList<String> friends=(ArrayList<String>) request.getAttribute("friends");
%>
<h1>Name is <%=name%></h1>
<h1>Name is ${name}</h1>
<h1>Friends are <%=friends%></h1>
<h1>Friends are ${friends}</h1>


</body>
</html>
