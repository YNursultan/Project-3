<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp"%>
<form action="Show" method="get">
    <c:forEach var="item" items="${items}">

        <input type="checkbox" name="items" id="chk1" value="${item.getName()}">
        <label for="chk1">${item.getName()} ${item.getCost()}</label>

    </c:forEach>
    <input type="submit" value="Buy">
</form>
<%@include file="footer.jsp"%>