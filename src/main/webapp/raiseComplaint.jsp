<!DOCTYPE html>
<html>
<head>
<title>Raise Complaint</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

<h2>Raise Complaint</h2>

<form action="raiseComplaint"
      method="post">

<input type="text"
       name="title"
       placeholder="Complaint Title"
       required>

<textarea name="description"
          placeholder="Complaint Description"
          rows="5"
          required>
</textarea>

<button type="submit">
Submit Complaint
</button>

</form>

</div>

</body>
</html>