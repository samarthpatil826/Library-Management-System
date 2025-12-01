<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
<link rel="stylesheet" href="viewBook.css">
</head>

<body>

<div class="table-container">

    <h2>Books List</h2>

    <table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Category</th>
        <th>Copies</th>
    </tr>

    <c:forEach var="book" items="${Books}">
        <tr>
            <td>${book.bid}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.category}</td>
            <td>${book.avlcopy}</td>
        </tr>
    </c:forEach>

</table>

    <a href="index.jsp" class="back-btn">Back to Home</a>

</div>

</body>
</html>
