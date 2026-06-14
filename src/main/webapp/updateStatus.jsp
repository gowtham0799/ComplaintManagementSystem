<!DOCTYPE html>
<html>
<head>
<title>Update Status</title>
</head>
<body>

<form action="updateStatus" method="post">

<input type="hidden"
       name="id"
       value="<%= request.getParameter("id") %>">

Status:

<select name="status">

<option>Pending</option>
<option>In Progress</option>
<option>Resolved</option>

</select>

<br><br>

<input type="submit" value="Update">

</form>

</body>
</html>