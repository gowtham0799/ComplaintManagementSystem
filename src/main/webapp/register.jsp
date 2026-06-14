<!DOCTYPE html>
<html>
<head>
<title>Employee Registration</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
background:linear-gradient(135deg,#1e3c72,#2a5298);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.register-card{
width:500px;
padding:35px;
background:white;
border-radius:15px;
box-shadow:0 10px 25px rgba(0,0,0,0.3);
}
</style>

</head>
<body>

<div class="register-card">

<h2 class="text-center mb-4">
Employee Registration
</h2>

<form action="register" method="post">

<input class="form-control mb-3"
type="text"
name="name"
placeholder="Full Name"
required>

<input class="form-control mb-3"
type="email"
name="email"
placeholder="Email"
required>

<input class="form-control mb-3"
type="password"
name="password"
placeholder="Password"
required>

<input class="form-control mb-3"
type="text"
name="department"
placeholder="Department"
required>

<button class="btn btn-success w-100">
Register
</button>

</form>

<div class="text-center mt-3">
<a href="login.jsp">
Already Registered? Login
</a>
</div>

</div>

</body>
</html>