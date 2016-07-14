<%@ page import="main.abstractPlain.AbstractPlain" %>
<%@ page import="main.engine.Engine" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head><title>Using JavaBeans in JSP</title></head>
<body>
<table border="1">
    <caption> Table plains parameters</caption>
    <tr>
        <th>Type</th>
        <th>Length</th>
        <th>Heigth</th>
        <th>MaxFligth</th>
        <th>MaxSpeed</th>
        <th>People</th>
        <th>Bomb</th>
        <th>Weigth</th>
    </tr>

    <%
        for (AbstractPlain value : (ArrayList<AbstractPlain>) request.getAttribute("collection")) {
    %>

    <tr>
        <td><a href=<%= "\"Controller?Type=" + value.getType() + "\"" %>><%= value.getType() %>
        </a>
        </td>
        <td><%=value.getLength()%>
        </td>
        <td><%=value.getHeigth()%>
        </td>
        <td><%=value.getMaxFligth()%>
        </td>
        <td><%=value.getMaxSpeed()%>
        </td>
        <td><%=value.getPeople()%>
        </td>
        <td><%=value.getBomb()%>
        </td>
        <td><%=value.getWeigth()%>
        </td>
    </tr>

    <%}%>
</table>
</body>
</html>


