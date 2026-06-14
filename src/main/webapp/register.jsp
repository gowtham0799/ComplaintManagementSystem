<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

<h2>Employee Registration</h2>

<form action="register" method="post">

<input type="text"
       name="name"
       placeholder="Full Name"
       required>

<input type="email"
       name="email"
       placeholder="Email"
       required>

<input type="password"
       name="password"
       placeholder="Password"
       required>

<input type="text"
       name="department"
       placeholder="Department"
       required>

<button type="submit">
Register
</button>

</form>

</div>

</body>
</html>