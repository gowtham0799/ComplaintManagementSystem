<!DOCTYPE html>
<html>
<head>

<title>Complaint Submitted</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:#f4f6f9;
}

.success-card{
    width:500px;
    background:white;
    padding:40px;
    border-radius:20px;
    text-align:center;
    box-shadow:0 5px 20px rgba(0,0,0,0.15);
}

.success-icon{
    font-size:70px;
    color:#198754;
}

</style>

</head>

<body>

<div class="success-card">

    <div class="success-icon">
        ✓
    </div>

    <h2 class="mt-3">
        Complaint Raised Successfully
    </h2>

    <p class="text-muted mt-3">
        Your complaint has been submitted and is now under review.
    </p>

    <a href="dashboard.jsp"
       class="btn btn-success mt-3">
       Back To Dashboard
    </a>

    <a href="raiseComplaint.jsp"
       class="btn btn-outline-primary mt-3 ms-2">
       Raise Another Complaint
    </a>

</div>

</body>
</html>