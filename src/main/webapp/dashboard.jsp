<%@ page import="com.cms.dto.Employee" %>

<%
Employee emp=(Employee)session.getAttribute("employee");

if(emp==null){
    response.sendRedirect("login.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="navbar">
Complaint Management System
</div>

<div class="sidebar">

<a href="dashboard.jsp">Dashboard</a>

<a href="raiseComplaint.jsp">
Raise Complaint
</a>

<a href="viewComplaints">
My Complaints
</a>

<a href="logout">
Logout
</a>

</div>

<div class="main">

<h2>
Welcome, <%= emp.getName() %>
</h2>

<div class="card">
<h3>Total Complaints</h3>
<p>15</p>
</div>

<div class="card">
<h3>Pending</h3>
<p>5</p>
</div>

<div class="card">
<h3>Resolved</h3>
<p>10</p>
</div>

</div>

</body>
</html>