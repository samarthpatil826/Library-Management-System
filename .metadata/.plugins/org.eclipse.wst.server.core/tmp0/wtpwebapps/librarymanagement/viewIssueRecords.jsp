<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Issued Books</title>
<link rel="stylesheet" href="viewIssueRecords.css">
</head>
<body>

<div class="table-container">

    <h2>Issued Books List</h2>

    <table>
        <tr>
            <th>Issue ID</th>
            <th>Book Title</th>
            <th>Member Name</th>
            <th>Issue Date</th>
            <th>Return Date</th>
        </tr>

        <c:forEach var="rec" items="${records}">
            <tr>
                <td>${rec.isid}</td>
                <td>${rec.book.title}</td>
                <td>${rec.member.name}</td>
                <td>${rec.idate}</td>
                <td>
                    <c:choose>
                        <c:when test="${rec.rdate == null}">
                            Not Returned
                        </c:when>
                        <c:otherwise>
                            ${rec.rdate}
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>

    </table>

    <a href="index.jsp" class="back-btn">Back to Home</a>

</div>

</body>
</html>
