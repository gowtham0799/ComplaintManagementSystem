<%@ page import="java.util.ArrayList"%>
<%@ page import="com.cms.dto.Complaint"%>

<!DOCTYPE html>
<html>
<head>
<title>My Complaints</title>
</head>
<body>

<h2>My Complaints</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Title</th>
    <th>Description</th>
    <th>Status</th>
</tr>

<%
ArrayList<Complaint> list =
(ArrayList<Complaint>)request.getAttribute("complaints");

if(list != null){
    for(Complaint c : list){
%>

<tr>
    <td><%= c.getId() %></td>
    <td><%= c.getTitle() %></td>
    <td><%= c.getDescription() %></td>
    <td><%= c.getStatus() %></td>
</tr>

<%
    }
}
%>

</table>

<br>

<a href="dashboard.jsp">Back to Dashboard</a>

</body>
</html>