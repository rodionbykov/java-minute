<%--
  Created by IntelliJ IDEA.
  User: rodionbykov
  Date: 6/30/17
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Hello World!</title>
  </head>
  <body>
  <p>Today's date: <%= (new java.util.Date()).toString() %></p>
  <%
    System.out.println("Your IP address is " + request.getRemoteAddr());
  %>
  </body>
</html>
