<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<title>Using jstl Functions</title>
</head>
<body>
<c:set var="String" value="JSTL Programming" />
<c:if test="${fn:contains(String,'Programming')}" >
<p> Found Programming string </p>
</c:if>
<b> After contains tag </b>
<c:if test="${fn:contains(String,'programming') }" >
<p> Found Programming string </p>
</c:if>
<c:if test="${fn:containsIgnoreCase(String,'programming') }" >
<p> Found Programming string </p>
</c:if>
<c:if test="${fn:endsWith(String,'Programming') }" >
<p> Found Programming string </p>
</c:if>
<c:if test="${fn:endsWith(String,'Programming') }" >
<p> Found Programming string </p>
</c:if>
<c:set> var="string1" value="It is first String" </c:set>
<c:set> var="string2" value="IT IS <xyz> </c:set>
</body>
</html>