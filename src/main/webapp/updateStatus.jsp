<!DOCTYPE html>
<html>
<head>

<title>Update Complaint Status</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#f4f6f9;
}

.container-box{
max-width:500px;
margin:80px auto;
background:white;
padding:30px;
border-radius:20px;
box-shadow:0 5px 15px rgba(0,0,0,0.15);
}

</style>

</head>

<body>

<div class="container-box">

<h2 class="text-center mb-4">
Update Complaint Status
</h2>

<form action="updateStatus" method="post">

<input type="hidden"
       name="id"
       value="<%= request.getParameter("id") %>">

<label class="form-label">
Status
</label>

<select name="status"
        class="form-select">

<option value="Pending">
Pending
</option>

<option value="In Progress">
In Progress
</option>

<option value="Resolved">
Resolved
</option>

</select>

<button class="btn btn-success w-100 mt-4">
Update Status
</button>

</form>

</div>

</body>
</html>