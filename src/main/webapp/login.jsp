<!DOCTYPE html>
<html>
<head>
<title>Employee Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
background:linear-gradient(135deg,#0f172a,#1e3a8a);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.login-card{
width:420px;
padding:35px;
border-radius:15px;
background:white;
box-shadow:0 10px 25px rgba(0,0,0,0.3);
}
</style>

</head>
<body>

<div class="login-card">

<h2 class="text-center mb-4">
Employee Login
</h2>

<form action="login" method="post">

<div class="mb-3">
<input type="email"
class="form-control"
name="email"
placeholder="Email Address"
required>
</div>

<div class="mb-3">
<input type="password"
class="form-control"
name="password"
placeholder="Password"
required>
</div>

<button class="btn btn-primary w-100">
Login
</button>

</form>

<div class="text-center mt-3">

Don't have an account?

<br>

<a href="register.jsp">
Register Here
</a>

</div>

</div>

</body>
</html>