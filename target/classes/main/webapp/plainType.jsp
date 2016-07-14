<%@ page import="main.servlet.Controller" %>
<%@ page import="main.AbstractPlain" %>
<%@ page import="java.util.ArrayList" %>
<%
    HttpSession ses = request.getSession();
    ArrayList<AbstractPlain> newCollection = (ArrayList<AbstractPlain>) ses.getAttribute("newCollection");
%>
<html>
<head><title>Certain Plains</title></head>
<body>
<table border="1">
    <caption> Table plains parameters only one type</caption>
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
        for (AbstractPlain value : newCollection) {
    %>

    <tr>
        <td> <%= value.getType() %>
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


