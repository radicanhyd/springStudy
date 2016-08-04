<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home2</title>
</head>
<body>

<table width= "600" border="1">

<c:forEach items="${list}" var = "dto">
<tr>
	<td>${dto.sid}</td>
	<td>${dto.bName}</td>
	<td>${dto.bTitle}</td>
	<td>${dto.bContent}</td>
	<td>${dto.bDate}</td>
</tr>
</c:forEach>


</table>

</body>
</html>
