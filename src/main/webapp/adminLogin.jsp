<!DOCTYPE html>
<html>
<head>

<title>Admin Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:linear-gradient(135deg,#111827,#2563eb);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.admin-card{
width:420px;
padding:35px;
background:white;
border-radius:15px;
box-shadow:0 10px 25px rgba(0,0,0,0.3);
}

</style>

</head>

<body>

<div class="admin-card">

<h2 class="text-center mb-4">
Admin Login
</h2>

<form action="adminLogin" method="post">

<input
class="form-control mb-3"
type="text"
name="username"
placeholder="Username"
required>

<input
class="form-control mb-3"
type="password"
name="password"
placeholder="Password"
required>

<button class="btn btn-success w-100">
Login
</button>

</form>

</div>

</body>
</html>