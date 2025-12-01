<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Issue Book</title>
<link rel="stylesheet" href="issueBook.css">
</head>
<body>

<div class="form-container">
    <h2>Issue Book</h2>

    <form action="issuebook" method="post">
        <label>Book ID</label>
        <input type="number" name="bookId" required>

        <label>Member ID</label>
        <input type="number" name="memberId" required>

        <button type="submit">Issue</button>
    </form>

    <a class="back-btn" href="index.jsp">Back to Home</a>
</div>

</body>
</html>
