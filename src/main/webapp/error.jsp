<!DOCTYPE html>
<html>
<head>

<title>Error</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
height:100vh;
display:flex;
justify-content:center;
align-items:center;
background:#f4f6f9;
}

.card{
width:500px;
padding:40px;
border-radius:20px;
border:none;
box-shadow:0 5px 20px rgba(0,0,0,0.15);
text-align:center;
}

.error{
font-size:70px;
color:red;
}

</style>

</head>

<body>

<div class="card">

<div class="error">
✖
</div>

<h2>
Operation Failed
</h2>

<p class="text-muted">
Something went wrong. Please try again.
</p>

<a href="register.jsp"
class="btn btn-danger">
Try Again
</a>

</div>

</body>
</html>