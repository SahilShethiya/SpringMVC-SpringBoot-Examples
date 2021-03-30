<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>

<c:set value="${sessionScope.len }" var="x"></c:set>
<c:set var="y" value="f:length(x)"></c:set>
<c:if test="${y eq 0 }">
	<c:set var="x" value="Sorry! Incorrect Username and password">
	</c:set>	
</c:if>
<c:forEach items="x" var="z" varStatus="counter">
[
	<c:if test="${ y eq 1 }"></c:if>
	{
		<c:set var="x" value="Welcome"></c:set>
		"key":"${x}"
	}
	
	</c:forEach>
]