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
<title>Employee Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#f4f6f9;
}

.sidebar{
position:fixed;
left:0;
top:0;
width:250px;
height:100%;
background:#0f172a;
padding-top:20px;
}

.sidebar h3{
color:white;
text-align:center;
margin-bottom:30px;
}

.sidebar a{
display:block;
padding:15px;
color:white;
text-decoration:none;
}

.sidebar a:hover{
background:#2563eb;
}

.main{
margin-left:260px;
padding:30px;
}

.stat-card{
border:none;
border-radius:15px;
box-shadow:0 4px 15px rgba(0,0,0,0.15);
}

.welcome{
background:white;
padding:20px;
border-radius:15px;
margin-bottom:25px;
}
</style>

</head>

<body>

<div class="sidebar">

<h3>CMS Portal</h3>

<a href="dashboard.jsp">Dashboard</a>

<a href="raiseComplaint.jsp">
Raise Complaint
</a>

<a href="viewComplaints">
My Complaints
</a>
<a href="profile.jsp">
Profile
</a>

<a href="logout">
Logout
</a>


</div>

<div class="main">

<div class="welcome">

<h2>
Welcome, <%= emp.getName() %>
</h2>

<p>
Department:
<strong><%= emp.getDepartment() %></strong>
</p>

</div>

<div class="row">

<div class="col-md-4">

<div class="card stat-card">

<div class="card-body">

<h5>Total Complaints</h5>

<h1>15</h1>

</div>

</div>

</div>

<div class="col-md-4">

<div class="card stat-card">

<div class="card-body">

<h5>Pending</h5>

<h1>5</h1>

</div>

</div>

</div>

<div class="col-md-4">

<div class="card stat-card">

<div class="card-body">

<h5>Resolved</h5>

<h1>10</h1>

</div>

</div>

</div>

</div>

</div>

</body>
</html>