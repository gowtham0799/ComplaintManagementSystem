<%@ page import="java.util.ArrayList"%>
<%@ page import="com.cms.dto.Complaint"%>

<!DOCTYPE html>
<html>
<head>

<title>My Complaints</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<h2 class="mb-4 text-center">
My Complaints
</h2>
<form action="searchComplaint" method="get">

    <input class="form-control"
           name="keyword"
           placeholder="Search Complaint Title">

    <button class="btn btn-primary mt-2">
        Search
    </button>

</form>

<br>

<div class="table-responsive">

<table class="table table-bordered table-hover shadow">

<thead class="table-dark">

<tr>
    <th>ID</th>
    <th>Title</th>
    <th>Description</th>
    <th>Category</th>
    <th>Priority</th>
    <th>Status</th>
    <th>Date</th>
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

<td><%= c.getCategory() %></td>

<td>

<%
if("Critical".equals(c.getPriority())){
%>

<span class="badge bg-danger">
Critical
</span>

<%
}
else if("High".equals(c.getPriority())){
%>

<span class="badge bg-warning text-dark">
High
</span>

<%
}
else if("Medium".equals(c.getPriority())){
%>

<span class="badge bg-primary">
Medium
</span>

<%
}
else{
%>

<span class="badge bg-info text-dark">
Low
</span>

<%
}
%>

</td>

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

<td>
<%= c.getCreatedAt() %>
</td>

</tr>

<%
}
}
else{
%>

<tr>
<td colspan="7" class="text-center">
No Complaints Found
</td>
</tr>

<%
}
%>

</tbody>

</table>

</div>

<div class="text-center mt-3">

<a href="dashboard.jsp"
class="btn btn-primary">
Back To Dashboard
</a>

</div>

</div>

</body>
</html>