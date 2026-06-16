<!DOCTYPE html>
<html>
<head>

<title>Admin Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<style>

.sidebar{
position:fixed;
left:0;
top:0;
width:250px;
height:100%;
background:#111827;
padding-top:20px;
}

.sidebar h3{
color:white;
text-align:center;
margin-bottom:30px;
}

.sidebar a{
display:block;
padding:15px;
text-decoration:none;
color:white;
}

.sidebar a:hover{
background:#2563eb;
}

.main{
margin-left:260px;
padding:30px;
}

</style>

</head>

<body>

<div class="sidebar">

<h3>Admin Panel</h3>

<a href="adminDashboard">
Dashboard
</a>

<a href="viewAllComplaints">
View Complaints
</a>

<a href="adminLogout">
Logout
</a>

</div>

<div class="main">

<h1>
Admin Dashboard
</h1>

<div class="row">

    <div class="col-md-3">
        <div class="card shadow">
            <div class="card-body text-center">
                <h5>Total Complaints</h5>
                <h1>${total}</h1>
            </div>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card shadow">
            <div class="card-body text-center">
                <h5>Pending</h5>
                <h1>${pending}</h1>
            </div>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card shadow">
            <div class="card-body text-center">
                <h5>In Progress</h5>
                <h1>${inProgress}</h1>
            </div>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card shadow">
            <div class="card-body text-center">
                <h5>Resolved</h5>
                <h1>${resolved}</h1>
            </div>
        </div>
    </div>

</div>

</div>

</div>

</div>

</body>
</html>