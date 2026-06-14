<!DOCTYPE html>
<html>
<head>
<title>Employee Login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

<h2>Employee Login</h2>

<form action="login" method="post">

<input type="email"
       name="email"
       placeholder="Enter Email"
       required>

<input type="password"
       name="password"
       placeholder="Enter Password"
       required>

<button type="submit">
Login
</button>
<p>Don't have an account?</p>

<a href="register.jsp">
    Register Here
</a>

</form>

<br>

<a href="register.jsp">
Create Account
</a>

</div>

</body>
</html>