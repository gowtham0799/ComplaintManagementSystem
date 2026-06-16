<!DOCTYPE html>
<html>
<head>
<title>Raise Complaint</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#f4f6f9;
}

.complaint-card{
width:700px;
margin:50px auto;
padding:30px;
background:white;
border-radius:15px;
box-shadow:0 5px 15px rgba(0,0,0,0.15);
}

</style>

</head>

<body>

<div class="complaint-card">

<h2 class="text-center mb-4">
Raise Complaint
</h2>

<form action="raiseComplaint" method="post">

<div class="mb-3">

<label class="form-label">
Complaint Title
</label>

<input
class="form-control"
type="text"
name="title"
required>

</div>
<div class="mb-3">

<label class="form-label">
Category
</label>

<select class="form-control"
        name="category">

<option>IT</option>
<option>HR</option>
<option>Network</option>
<option>Security</option>
<option>Maintenance</option>
<option>Other</option>

</select>

</div>
<div class="mb-3">

<label class="form-label">
Priority
</label>

<select class="form-control"
        name="priority">

<option>Low</option>
<option>Medium</option>
<option>High</option>
<option>Critical</option>

</select>

</div>
<div class="mb-3">

<label class="form-label">
Description
</label>

<textarea
class="form-control"
name="description"
rows="6"
required>
</textarea>

</div>

<button class="btn btn-primary w-100">
Submit Complaint
</button>

</form>

<br>

<a href="dashboard.jsp"
class="btn btn-secondary">
Back
</a>

</div>

</body>
</html>