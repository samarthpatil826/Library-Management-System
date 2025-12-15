<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Member</title>
<link rel="stylesheet" href="addMember.css">
</head>
<body class="form-bg">

<div class="form-container">
    <h2>Add Member</h2>

    <form action="addMember" method="post">
        <label>Member Name</label>
        <input type="text" name="name" required>

        <label>Email</label>
        <input type="email" name="email" required>
        
          <label>Phone</label>
        <input type="tel" name="num" required>

        <button type="submit">Add Member</button>
    </form>

    <a href="index.jsp" class="back-btn">Back to Home</a>
</div>

</body>
</html>
