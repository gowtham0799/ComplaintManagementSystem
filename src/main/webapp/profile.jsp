<%@ page import="com.cms.dto.Employee"%>

<%
Employee emp =
(Employee)session.getAttribute("employee");

if(emp == null){
    response.sendRedirect("login.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>
<head>

<title>Profile</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#f4f6f9;
}

.profile-card{
    width:600px;
    margin:50px auto;
    border-radius:15px;
    box-shadow:0 4px 15px rgba(0,0,0,0.15);
}

</style>

</head>

<body>

<div class="container">

<div class="card profile-card">

<div class="card-header bg-primary text-white text-center">

<h2>Employee Profile</h2>

</div>

<div class="card-body">

<p>
<strong>Name:</strong>
<%= emp.getName() %>
</p>

<p>
<strong>Email:</strong>
<%= emp.getEmail() %>
</p>

<p>
<strong>Department:</strong>
<%= emp.getDepartment() %>
</p>

<div class="text-center mt-4">

<a href="dashboard.jsp"
class="btn btn-primary">
Back To Dashboard
</a>

</div>

</div>

</div>

</div>

</body>
</html>