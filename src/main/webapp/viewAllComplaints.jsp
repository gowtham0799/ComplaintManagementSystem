<%@ page import="java.util.ArrayList"%>
<%@ page import="com.cms.dto.Complaint"%>

<!DOCTYPE html>
<html>
<head>

<title>All Complaints</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#f4f6f9;
}

.header{
    background:#0f172a;
    color:white;
    padding:20px;
    text-align:center;
    font-size:28px;
    font-weight:bold;
    box-shadow:0 2px 10px rgba(0,0,0,0.2);
}

.table-container{
    background:white;
    padding:25px;
    border-radius:15px;
    box-shadow:0 5px 15px rgba(0,0,0,0.15);
}

.table th{
    text-align:center;
}

.table td{
    vertical-align:middle;
}

.back-btn{
    margin-top:20px;
}

</style>

</head>

<body>

<div class="header">
Complaint Management System - Admin Panel
</div>

<div class="container mt-5">

<div class="table-container">

<h2 class="mb-4 text-center">
All Complaints
</h2>

<form action="searchComplaint" method="get">

<div class="row mb-4">

<div class="col-md-10">

<input
type="text"
name="keyword"
class="form-control"
placeholder="Search Complaint Title">

</div>

<div class="col-md-2">

<button class="btn btn-primary w-100">
Search
</button>

</div>

</div>

</form>

<div class="table-responsive">

<table class="table table-bordered table-hover">

<thead class="table-dark">

<tr>

<th>ID</th>
<th>Title</th>
<th>Description</th>
<th>Employee ID</th>
<th>Status</th>

</tr>

</thead>

<tbody>

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

<td><%= c.getEmployeeId() %></td>

<td>

<%
if("Pending".equals(c.getStatus())){
%>

<span class="badge bg-danger">
Pending
</span>

<%
}
else if("In Progress".equals(c.getStatus())){
%>

<span class="badge bg-warning text-dark">
In Progress
</span>

<%
}
else{
%>

<span class="badge bg-success">
Resolved
</span>

<%
}
%>

</td>

</tr>

<%
}
}
else{
%>

<tr>

<td colspan="5" class="text-center text-danger">
No Complaints Found
</td>

</tr>

<%
}
%>

</tbody>

</table>

</div>

<div class="text-center">

<a href="adminDashboard.jsp"
class="btn btn-secondary back-btn">
Back To Dashboard
</a>

</div>

</div>

</div>

</body>
</html>