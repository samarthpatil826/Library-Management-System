 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Members</title>
<link rel="stylesheet" href="viewMembers.css">
</head>
<body>

<div class="table-container">

    <h2>Members List</h2>

    <table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Contact</th>
    </tr>

   <c:forEach var="m" items="${members}">
    <tr>
        <td>${m.mid}</td>
        <td>${m.name}</td>
        <td>${m.email}</td>
         <td>${m.contact}</td>
    </tr>
</c:forEach>


</table>

    <a href="index.jsp" class="back-btn">Back to Home</a>

</div>

</body>
</html>
