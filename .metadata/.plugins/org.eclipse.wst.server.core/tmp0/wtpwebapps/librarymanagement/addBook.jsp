<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<link rel="stylesheet" href="style.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">

</head>
<body>
    <div class="container">
        <h2>Add New Book</h2>

        <form action="addBook" method="post">
            <label>Title</label>
            <input type="text" name="title" required>

            <label>Author</label>
            <input type="text" name="author" required>

            <label>Category</label>
            <input type="text" name="category" required>

            <label>Copies</label>
            <input type="number" name="copies" required>

            <button type="submit">Add Book</button>
        </form>

        <br>
        <a href="index.jsp">Back to Home</a>
    </div>
</body>
</html>
