<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/cts" user="root" password="root"/>
<sql:query dataSource="${db}" var="rs">
select * from Student;
</sql:query>
<table boarder="2" width="100%">
<tr>
<th>name</th>
<th> halticket</th>
<th> clg</th>
</tr>
<c:forEach var="table" items="${rs.rows}"> 
<tr>
<td><c:out value="${table.name}"/></td> 
<td><c:out value="${table.htno}"/></td>
<td><c:out value="${table.ccode}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>
</body>
</html>