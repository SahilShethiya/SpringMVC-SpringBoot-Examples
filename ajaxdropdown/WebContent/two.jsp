<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>

<c:set value="${sessionScope.list2 }" var="x"></c:set>
<c:set var="y" value="f:length(x)"></c:set>
<c:forEach items="x" var="z" varStatus="counter">
[
	{
		"sid": "${z.id}",
		"sname": ${z.name}""
	}
	
	<c:if test="${ y ne counter.count }">,</c:if>
	</c:forEach>
]